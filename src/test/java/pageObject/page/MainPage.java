package test.java.pageObject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class MainPage extends BasePage {
    public WebDriver driver;
    /**
     * constructor of SearchPage class
     * @param driver
     */
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@href='/ct/1232/']")
    private WebElement phoneSearchLink;

    @FindBy(xpath = "//*[@class=\"catalog-block-head\"]")
    private List<WebElement> searchResults;

    @FindBy(id = "login-form-login")
    private WebElement loginField;

    @FindBy(id = "login-form-password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[@href=\"/my/settings/\"]")
    private WebElement setting;

    @FindBy(xpath = "//*[@class=\"user-info\"]//span")
    private WebElement userName;

    @FindBy(xpath = "(//*[@class=\"dropdown-hint afterLeft\"])[2]")
    private WebElement hintNotRightPassword;

    public void clickPhoneLink(){
        phoneSearchLink.click();
    }
    public WebElement getSearchPhoneLink(){
        return phoneSearchLink;
    }

     public List<WebElement> getTitlesOfResults() {
         return searchResults;
    }
    public void inputLogin(String login){
        loginField.sendKeys(login);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickOnLoginBtn(){
        loginBtn.click();
    }
    public String getUserName(){
        return userName.getText();
    }
    public boolean hintPasswordIsDisplayed(){
        return hintNotRightPassword.isDisplayed();
    }
    public WebElement getHint(){
        return hintNotRightPassword;
    }


}
