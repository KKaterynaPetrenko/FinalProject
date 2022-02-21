package test.java.pageObject.test;
import org.testng.Assert;
import test.java.pageObject.context.mainContext;
import org.testng.annotations.Test;

public class searchMainTest extends BaseTest {

    @Test(groups = {"searchBySearchField"})
     public void searchMainPage(){
        String searchText = "iPhone 12";
        mainContext.search(searchText);
        Assert.assertTrue(true);
    }

    @Test(groups = {"searchBySearchField"})
    public void matchResults(){
        String searchText = "iPhone 13";
        mainContext.search(searchText);
        for (String text: mainContext.matchResults()) {
            Assert.assertTrue(text.contains(searchText));
        }
    }
}

