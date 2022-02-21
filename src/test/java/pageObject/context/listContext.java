package test.java.pageObject.context;
import test.java.pageObject.page.ListPage;
import static test.java.pageObject.test.BaseTest.driver;

public class listContext {
    public static ListPage listPage = new ListPage(driver);

    public static String getTestAddedListItem(){
        return listPage.getText();
    }

    public static void clickOnDeleteBtn(){
        listPage.clickOnDeleteBtn();
    }
     public static String getTextNotAnyPurchase(){
       return listPage.getTextNotPurchaseInList();
     }
}
