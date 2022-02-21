package test.java.pageObject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListPage extends BasePage{
    public WebDriver driver;
    /**
     * constructor of SearchPage class
     * @param driver
     */
    public ListPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class=\"catalog-block-head\"]/a")
    private WebElement addedListItem;

    @FindBy(className = "list-delete-product")
    private WebElement deleteItemBtn;

    @FindBy(xpath = "//*[@class=\"empty-list\"]/strong")
    private WebElement notPurchaseInList;


    public String getText(){
        return addedListItem.getText();
    }
    public void clickOnDeleteBtn(){
        deleteItemBtn.click();
    }
    public String getTextNotPurchaseInList(){
        return notPurchaseInList.getText();
    }




}
