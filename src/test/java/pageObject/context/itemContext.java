package test.java.pageObject.context;
import test.java.pageObject.page.ItemPage;
import static test.java.pageObject.test.BaseTest.driver;

public class itemContext {
    public static ItemPage itemPage = new ItemPage(driver);

    public static void addFavoriteShop(){

        itemPage.addFavoriteShop();
        itemPage.clickOnUserInfo();
        itemPage.clickOnFavoriteShops();
    }

    public static String getShopName(){
        return  itemPage.getShopName();
    }

}
