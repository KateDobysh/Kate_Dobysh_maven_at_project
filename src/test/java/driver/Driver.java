package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-search-engine-choice-screen");
//            options.addArguments("--headless");
            options.addArguments("--disable-web-security");
//            options.addArguments("user-data-dir=/path/to/clean/profile");
            options.addArguments("--remote-debugging-port=9222");

            driver = new ChromeDriver(options);
            driver.manage().window().maximize(); // Максимизируем окно
        }
        return driver;
    }
}