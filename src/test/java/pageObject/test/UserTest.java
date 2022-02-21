package test.java.pageObject.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pageObject.context.itemContext;
import test.java.pageObject.context.mainContext;
import test.java.pageObject.context.searchContext;
import test.java.pageObject.context.userContext;

public class UserTest extends BaseTest{

    @Test(groups = "favoriteShop")
    public void addFavoriteShop() throws InterruptedException {
        mainContext.clickOnUserInfo();
        mainContext.login();
        Thread.sleep(2000);
        mainContext.goToPhoneSearch();
        searchContext.clickFirstResult();
        String titleInItemPage = itemContext.getShopName();
        itemContext.addFavoriteShop();
        String titleInUserPage = userContext.getTitleOfFavoriteShop();
        boolean result = titleInUserPage.contains(titleInItemPage);
        Assert.assertTrue(result);
        userContext.deleteFavoriteShop();

    }
    @Test(groups = "favoriteShop")
    public void deleteFavoriteShop() throws InterruptedException {
        mainContext.clickOnUserInfo();
        mainContext.login();
        Thread.sleep(2000);
        mainContext.goToPhoneSearch();
        searchContext.clickFirstResult();
        itemContext.addFavoriteShop();
        userContext.deleteFavoriteShop();
        driver.navigate().refresh();
        String notAnyItem = userContext.notAnyFavoriteShop();
        Assert.assertTrue(notAnyItem.contains("Немає"));
    }

}
