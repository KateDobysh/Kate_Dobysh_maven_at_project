package tests;

import driver.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageTest {

    static WebDriver driver = Driver.getDriver();

    @AfterClass
    public static void closeDriver(){
        Driver.quitDriver();
    }
}