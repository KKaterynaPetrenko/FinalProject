package test.java.pageObject.context;
import test.java.pageObject.page.UserPage;
import static test.java.pageObject.test.BaseTest.driver;

public class userContext {
    public static UserPage userPage = new UserPage(driver);
    public static String getTitleOfFavoriteShop(){
        return userPage.getTitleFavoriteShop();
    }
    public static void deleteFavoriteShop(){
        userPage.deleteFavoriteShop();
    }
    public static String notAnyFavoriteShop(){
       return userPage.getTextNotFavoriteShop();
    }
}
