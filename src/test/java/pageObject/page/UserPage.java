package test.java.pageObject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage extends BasePage{
    public WebDriver driver;
    /**
     * constructor of SearchPage class
     * @param driver
     */
    public UserPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class=\"po-product-title\"]")
    private WebElement titleFavoriteShop;

    @FindBy(className = "favorite-delete")
    private WebElement iconDeleteFavorite;

    public String getTitleFavoriteShop(){
        return titleFavoriteShop.getText();
    }

    public void deleteFavoriteShop(){
        iconDeleteFavorite.click();
    }

}
