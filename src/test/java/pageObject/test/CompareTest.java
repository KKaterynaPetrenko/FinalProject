package test.java.pageObject.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pageObject.context.compareContext;
import test.java.pageObject.context.mainContext;
import test.java.pageObject.context.searchContext;


public class CompareTest extends BaseTest {

    @Test(groups = {"compare"})
    public void addToCompare(){
        mainContext.goToPhoneSearch();
        String firstTitle = searchContext.getFirstTitleOfResults();
        String secondTitle = searchContext.getSecondTitleOfResults();
        searchContext.addToCompare();
        boolean firstTitles = firstTitle.equals(compareContext.getSecondTitleToCompare());
        boolean secondTitles = secondTitle.equals(compareContext.getFirstTitleToCompare());
        Assert.assertTrue(firstTitles && secondTitles);

    }

}
