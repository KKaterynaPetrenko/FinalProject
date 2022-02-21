package test.java.pageObject.test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pageObject.context.mainContext;

import java.util.Set;

public class LoginTest extends BaseTest {

    @Test(groups = {"loginHP"})
    public void loginHappyPath() throws InterruptedException {
        mainContext.clickOnUserInfo();
        mainContext.login();
        Thread.sleep(2000);
        String userName = "testKatePetro";
        Assert.assertEquals(userName,mainContext.getUserName());
    }

    @Test(groups = {"loginNP"})
    public void loginNegativePath() throws InterruptedException {
        mainContext.clickOnUserInfo();
        mainContext.loginNP();
        Thread.sleep(2000);
        Assert.assertTrue(mainContext.hintPasswordIsDisplayed());
    }
}
