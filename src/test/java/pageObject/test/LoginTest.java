package test.java.pageObject.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pageObject.context.mainContext;

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
