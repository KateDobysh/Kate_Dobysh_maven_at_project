package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class BookingCurrency {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--no-first-run");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");

        WebElement currencyIcon = driver.findElement(By
                .xpath("//button[@data-testid='header-currency-picker-trigger']"));
        Actions hoverOverTheCurrency = new Actions(driver);
        hoverOverTheCurrency.moveToElement(currencyIcon);
        hoverOverTheCurrency.perform();

        WebElement languageIcon = driver.findElement(By
                .xpath("//img[@src='https://t-cf.bstatic.com/design-assets/assets/v3.122.0/images-flags/Us@3x.png']"));
        Actions hoverOverTheLanguage = new Actions(driver);
        hoverOverTheLanguage.moveToElement(languageIcon);
        hoverOverTheLanguage.perform();
    }
}
