package test.java.pageObject.test;
import org.testng.annotations.Test;
import test.java.pageObject.context.listContext;
import test.java.pageObject.context.mainContext;
import test.java.pageObject.context.searchContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ListTest extends BaseTest {

    @Test(groups = {"inList"})
    public void addItemInList(){
        mainContext.goToPhoneSearch();
        searchContext.addToList();
        String addedItem = searchContext.getFirstTitleResult();
        searchContext.clickOnList();
        String itemInList = listContext.getTestAddedListItem();
        assertThat(addedItem, equalTo(itemInList));
    }

    @Test(groups = {"inList"})
    public void deleteListItem() {
        mainContext.goToPhoneSearch();
        searchContext.addToList();
        searchContext.clickOnList();
        listContext.clickOnDeleteBtn();
        String actualPhrase = listContext.getTextNotAnyPurchase();
        String expectedPhrase = "У списку немає товарів";
        assertThat(actualPhrase, equalTo(expectedPhrase));
    }

}
