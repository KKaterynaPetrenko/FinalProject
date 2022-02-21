package test.java.pageObject.test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import test.java.pageObject.configuration.ConfProperties;


import java.time.Duration;


public abstract class BaseTest {
    public static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("searchPage"));
    }

    @BeforeMethod
    public void reset(){
        driver.manage().deleteAllCookies();
        driver.get(ConfProperties.getProperty("searchPage"));
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
