package test.java.pageObject.context;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import test.java.pageObject.page.SearchPhonePage;
import java.util.ArrayList;
import java.util.List;
import static test.java.pageObject.test.BaseTest.driver;

public class searchContext {
    public static SearchPhonePage searchPhonePage = new SearchPhonePage(driver);

    public static String getMinPrice(){
        return searchPhonePage.getMinPrice();
    }

    public static String getPriceFromTo(){
        return searchPhonePage.getPriceCheapestPhone();
   }

    public static void findCheapest() throws InterruptedException {
        String minPrice = searchPhonePage.getMinPrice();
        searchPhonePage.inputMaxPrice(minPrice);
        searchPhonePage.searchWithHotKey();
        Thread.sleep(1000);
    }
    public static boolean noResultIsDisplayed(){
       return searchPhonePage.noResultIsDisplayed();
    }
    public static void findNoResults(){
        int minPrice = Integer.parseInt(searchPhonePage.getMinPrice(), 10);
        int i = minPrice - 1;
        String lessThenMin = String.valueOf(i);
        searchPhonePage.inputMaxPrice(lessThenMin);
        searchPhonePage.searchWithHotKey();
    }


    public static ArrayList<Integer> intDiscount20List() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> discountElements = searchPhonePage.getDiscountResults();
        ArrayList<Integer> discounts = new ArrayList<>();

        for (WebElement element: discountElements) {
            String text = element.getText().replace("%","");
            int discount = Integer.parseInt(text);

            discounts.add(discount);
        }

        return discounts;
    }

    public static void clickDiscount20(){
        searchPhonePage.filterBy20Discount();
    }

    public static boolean matchDiscount () throws InterruptedException {
        Integer discount = 20;
        for(Integer integer: intDiscount20List()) {
            if (integer < discount)
                return false;
        }
        return true;
    }

    public static void searchByPaymentMethod() {
          searchPhonePage.openAllFilterDropdown();
          searchPhonePage.clickOpenAll();
          searchPhonePage.PayByCard();
          searchPhonePage.PayByParts();
    }

    public static boolean payByCard(){
        return searchPhonePage.getFirstResultPayByCard();
    }
    public static boolean payByParts(){
        return searchPhonePage.getFirstResultPayByPart();
    }
    public static String getColorHoverTitle(){
        Actions builder = new Actions(driver);
        builder.moveToElement(searchPhonePage.firstTitleOfItem()).build().perform();
        return searchPhonePage.firstTitleOfItem().getCssValue("Color");
    }

    public static String getColorInList(){
          searchPhonePage.clickInListBtn();
          driver.navigate().refresh();
          return searchPhonePage.getColorInListBtn();
    }

    public static void addToList(){
        searchPhonePage.clickInListBtn();
    }
    public static String getFirstTitleResult(){
       return searchPhonePage.firstTitleOfItem().getText();
    }
    public static void clickOnList(){
        searchPhonePage.clickOnList();
    }
    public static void addToCompare(){
        searchPhonePage.clickToCompareFirstResult();
        searchPhonePage.clickToCompareSecondResult();
        searchPhonePage.clickToCompare();
    }
    public static String getFirstTitleOfResults(){
        return searchPhonePage.textOfFirstTitleResult();
    }
    public static String getSecondTitleOfResults(){
        return searchPhonePage.textOfSecondTitleResult();
    }
    public static void clickFirstResult(){
        searchPhonePage.clickFirstResult();
    }
    public static ArrayList<String> titleList(){
        List<WebElement> titlesElements = searchPhonePage.getTitlesOfResults();
        ArrayList<String> titles = new ArrayList<>();

        for (WebElement element: titlesElements) {
            String title = element.getText();
            titles.add(title);
        }
        return titles;
    }
    public static void clickAsusModelFilter(){
        searchPhonePage.clickOnAsusModelFilter();
    }

}
