package test.java.pageObject.page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class SearchPhonePage extends BasePage {
    public WebDriver driver;
    /**
     * constructor of SearchPage class
     * @param driver
     */
    public SearchPhonePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(id = "price-max")
    private  WebElement fieldMaxPrice;

    @FindBy(id = "price-min")
    private WebElement fieldMinPrice;

    @FindBy(className = "no-block")
    private  WebElement noResultBlock;

    @FindBy(xpath = "//a[@href=\"/ct/1232/?discount=20&idx=0\"]")
    private WebElement discount20;

    @FindBy(xpath = "//span[@class=\"discount\"]")
    private List<WebElement> discountResults;

    @FindBy(xpath = "//span[@class=\"discount\"][1]")
    private WebElement discount20firstResult;

    @FindBy(className = "toggler")
    private WebElement allFilters;

    @FindBy(xpath = "//*[contains(text(), 'Розгорнути всі')]")
    private WebElement openingAll;

    @FindBy(xpath = "//a[@href=\"/ct/1232/?part_pay=1\"]")
    private  WebElement filterPayByParts;

    @FindBy(xpath = "//a[@href='/ct/1232/?idx=0&card_pay=1']")
    private WebElement filterPayByCard;

    @FindBy(xpath = "(//*[@class=\"catalog-product-head\"]//strong)[2]")
    private WebElement priceFromTo;

    @FindBy(className = "icon-pay-parts-stroke")
    private WebElement resultPayByCard;

    @FindBy(className = "icon-card-stroke")
    private WebElement resultPayByPart;

    @FindBy(className = "add-to-list-link")
    private WebElement btnInList;

    @FindBy(xpath = "(//*[@class=\"remove-from-list\"])[1]/a")
    private WebElement iconInList;

    @FindBy(xpath = "(//*[@class=\"catalog-block-head\"]/a)[1]")
    private WebElement firstItemTitle;

    @FindBy(xpath = "(//*[@class=\"catalog-block-head\"])[2]")
    private WebElement secondItemTitle;

    @FindBy(xpath = "(//*[@class=\"add-to-compare\"])[1]")
    private WebElement addToCompareBtnFirst;

    @FindBy(xpath = "(//*[@class=\"add-to-compare\"])[2]")
    private WebElement addToCompareBtnSecond;

    @FindBy(xpath = "//a[@href=\"/compare/1232/\"]")
    private WebElement compareBtn;


    public void inputMaxPrice(String maxPrice){
        fieldMaxPrice.sendKeys(maxPrice);

    }
    public void searchWithHotKey(){
        fieldMaxPrice.sendKeys(Keys.ENTER);
    }

    public String getMinPrice(){
        return  fieldMinPrice.getAttribute("placeholder");
    }

    public boolean noResultIsDisplayed (){
       return this.isDisplayed(noResultBlock);
    }

    public void filterBy20Discount(){
        discount20.click();
    }

    public List<WebElement> getDiscountResults(){
        return discountResults;
    }

    public void openAllFilterDropdown(){
        allFilters.click();
    }
    public void clickOpenAll(){
        openingAll.click();
    }

    public void PayByParts(){
        filterPayByParts.click();
    }

    public void PayByCard(){
        filterPayByCard.click();
    }
    public String getPriceCheapestPhone(){
        return priceFromTo.getText();
    }

    public boolean getFirstResultPayByCard(){
        return filterPayByCard.isDisplayed();
    }
    public boolean getFirstResultPayByPart(){
        return filterPayByParts.isDisplayed();
    }
    public void clickInListBtn(){
        btnInList.click();
    }
    public String getColorInListBtn(){
        return iconInList.getCssValue("Color");
    }
    public WebElement firstTitleOfItem(){
        return firstItemTitle;
    }
    public void clickFirstResult(){
        firstItemTitle.click();
    }
    public String textOfFirstTitleResult(){
        return firstItemTitle.getText();
    }
    public String textOfSecondTitleResult(){
        return secondItemTitle.getText();
    }
    public void clickToCompareFirstResult(){
        addToCompareBtnFirst.click();
    }
    public void clickToCompareSecondResult(){
        addToCompareBtnSecond.click();
    }
    public void clickToCompare(){
        compareBtn.click();
    }
}
