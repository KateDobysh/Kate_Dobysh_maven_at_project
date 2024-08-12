package driver;

import io.cucumber.java.After;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static WebDriver driver;
    private static final Logger logger = LogManager.getLogger(Driver.class);

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");
            options.addArguments("--disable-web-security");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void resetDriver() {
        driver = null;
    }

    @After
    public void tearDown() {
        WebDriver driver = Driver.getDriver();
        if (driver != null) {
            logger.info("Closing the browser");
            driver.quit();
            Driver.resetDriver();
        }else {
            logger.info("Driver was null");
        }
    }
}