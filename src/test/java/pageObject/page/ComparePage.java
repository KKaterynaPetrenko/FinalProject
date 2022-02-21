package test.java.pageObject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage extends BasePage{
    public WebDriver driver;
    /**
     * constructor of SearchPage class
     * @param driver
     */
    public ComparePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@class=\"catalog-block-head\"]")
    private WebElement firstTitleItemToCompare;

    @FindBy(xpath = "(//*[@class=\"catalog-block-head\"])[2]")
    private WebElement secondTitleItemToCompare;

    public String getTitleFirstItemToCompare(){
        return firstTitleItemToCompare.getText();
    }
    public String getTitleSecondItemToCompare(){
        return secondTitleItemToCompare.getText();
    }
}
