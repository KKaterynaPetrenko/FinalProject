package test.java.pageObject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage extends BasePage {
    public WebDriver driver;
    /**
     * constructor of SearchPage class
     * @param driver
     */
    public ItemPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@class=\"td-block td-block--product2\"]/a")
    private WebElement favoriteShop;

    @FindBy(xpath = "//*[@class=\"td-block td-block--product1\"]//img")
    private WebElement shopName;

    public void addFavoriteShop(){
        favoriteShop.click();
    }
    public String getShopName(){
       return shopName.getAttribute("alt");
    }
}
