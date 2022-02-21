package test.java.pageObject.context;
import test.java.pageObject.page.ComparePage;

import static test.java.pageObject.test.BaseTest.driver;

public class compareContext {
    public static ComparePage comparePage = new ComparePage(driver);

    public static String getFirstTitleToCompare(){
       return comparePage.getTitleFirstItemToCompare();
    }
    public static String getSecondTitleToCompare(){
        return comparePage.getTitleSecondItemToCompare();
    }
}
