package test.java.pageObject.context;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import test.java.pageObject.page.MainPage;
import java.util.ArrayList;
import java.util.Set;

import static test.java.pageObject.test.BaseTest.driver;

public class mainContext {
    public static MainPage mainPage = new MainPage(driver);

    public static void search(String value) {
        if (mainPage.inputSearchIsClear()) {
            mainPage.inputSearch(value);
            mainPage.clickSearchBtn();
        }
    }
    public static void goToPhoneSearch() {
       mainPage.clickPhoneLink();
    }

    public static ArrayList<String> matchResults(){
        ArrayList<String> stResults = new ArrayList<>();

        for (WebElement element : mainPage.getTitlesOfResults()) {
            stResults.add(element.getText());
        }
        return  stResults;
    }

    public static void clickOnUserInfo(){
        mainPage.clickOnUserInfo();
    }
    public static String getUserName(){
        return mainPage.getUserName();
    }

    public static void login(){
        String login = "testKatePetro@gmail.com";
        String password = "Katetest3";
        mainPage.inputLogin(login);
        mainPage.inputPassword(password);
        mainPage.clickOnLoginBtn();
    }
    public static void loginNP(){
        String login = "testKatePetro@gmail.com";
        String password = "Katetest38";
        mainPage.inputLogin(login);
        mainPage.inputPassword(password);
        mainPage.clickOnLoginBtn();
    }
    public static boolean hintPasswordIsDisplayed(){
        return mainPage.hintPasswordIsDisplayed();
    }
    public static WebElement getHint(){
        return mainPage.getHint();
    }
}
