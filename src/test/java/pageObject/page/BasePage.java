package test.java.pageObject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage {
    @FindBy(className= "footer")
    private WebElement footer;

    @FindBy(name = "fn")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='search-group-submit']")
    private WebElement searchBtn;

    @FindBy(className = "user-purchase")
    private WebElement listOfPurchase;

    @FindBy(className = "user-info")
    private WebElement userInfoBtn;

    @FindBy(xpath = "//*[@href=\"/my/favorite-firm/\"]")
    private WebElement favoriteShops;


    public boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public boolean isClear(WebElement element){
        return element.getText().equals("");
    }
    public void inputSearch(String searchText){
        searchField.sendKeys(searchText);
    }
    public boolean inputSearchIsClear() {
        return this.isClear(searchField);
    }

    public void clickSearchBtn() {
        searchBtn.click();

    }
    public void clickOnList(){
        listOfPurchase.click();
    }
    public void clickOnUserInfo(){
        userInfoBtn.click();
    }
    public void clickOnFavoriteShops(){
        favoriteShops.click();
    }
}
