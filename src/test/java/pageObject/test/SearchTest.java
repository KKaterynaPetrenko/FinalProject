package test.java.pageObject.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.pageObject.context.searchContext;
import test.java.pageObject.context.mainContext;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {
    @Test(groups= {"searchByFilter"})
    public void searchCheapestPhone() throws InterruptedException {
        mainContext.goToPhoneSearch();
        searchContext.findCheapest();
        assertThat(searchContext.getPriceFromTo(),
        containsString(searchContext.getMinPrice()));
    }

    @Test(groups= {"searchNP"})
    public void searchWithoutResult(){
        mainContext.goToPhoneSearch();
        searchContext.findNoResults();
        Assert.assertTrue(searchContext.noResultIsDisplayed());
    }

    @Test(groups= {"searchByFilter"})
    public void searchByDiscount20() throws InterruptedException {
       mainContext.goToPhoneSearch();
       searchContext.clickDiscount20();
       boolean result = searchContext.matchDiscount();
       Assert.assertTrue(result);
    }

    @Test(groups= {"searchByFilter"})
    public void searchByPaymentType() {
        mainContext.goToPhoneSearch();
        searchContext.searchByPaymentMethod();
        Assert.assertTrue(searchContext.payByCard() && searchContext.payByParts());
    }

//    @Test(groups = {"color"})
//    public void matchTitleColor(){
//        mainContext.goToPhoneSearch();
//        String expectedColorTitle = "rgb(255, 153, 0)";
//        String actualColorTitle =  searchContext.getColorHoverTitle();
//        assertThat(actualColorTitle, equalTo(expectedColorTitle));
//    }

    @Test(groups = {"inList"})
    public void matchColorInList(){
        mainContext.goToPhoneSearch();
        String expectedColor = "rgb(255, 72, 0)";
        String actualColor = searchContext.getColorInList();
        assertThat(actualColor, equalTo(expectedColor));
    }

}
