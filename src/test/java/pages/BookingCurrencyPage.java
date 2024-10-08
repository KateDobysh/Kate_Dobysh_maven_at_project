package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BookingCurrencyPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(BookingCurrencyPage.class);

    public static final String CURRENCY_ICON_XPATH = ("//button[@data-testid='header-currency-picker-trigger']");
    public static final String LANGUAGE_ICON_XPATH = ("//img[@src='https://t-cf.bstatic.com/design-assets/assets/v3.122.0/images-flags/Us@3x.png']");
    public static final String CURRENCY_HOVER_MESSAGE = ("//*[text()='Select your currency']");
    public static final String LANGUAGE_HOVER_MASSAGE = ("//*[text()='Select your language']");

    public void open(String url) {
        LOGGER.info("Opening URL: {}", url);
        driver.get(url);
    }

    public boolean currencyIconOnThePage(){
        LOGGER.debug("Checking if currency icon is displayed on the page");
        WebElement currencyIcon = driver.findElement(By.xpath(CURRENCY_ICON_XPATH));
        boolean isDisplayed = currencyIcon.isDisplayed();
        LOGGER.info("Currency icon displayed: {}", isDisplayed);
        return currencyIcon.isDisplayed();
    }

    public void hoverOverTheCurrency() {
        LOGGER.info("Hovering over the currency icon");
        WebElement currencyIcon = driver.findElement(By.xpath(CURRENCY_ICON_XPATH));
        Actions hoverOverTheCurrency = new Actions(driver);
        hoverOverTheCurrency.moveToElement(currencyIcon).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CURRENCY_HOVER_MESSAGE)));
        LOGGER.debug("Finished hovering over the currency icon");
    }

    public boolean languageIconOnThePage(){
        LOGGER.debug("Checking if language icon is displayed on the page");
        WebElement languageIcon = driver.findElement(By.xpath(LANGUAGE_ICON_XPATH));
        boolean isDisplayed = languageIcon.isDisplayed();
        LOGGER.info("Language icon displayed: {}", isDisplayed);
        return languageIcon.isDisplayed();
    }

    public void hoverOverTheLanguage() {
        LOGGER.info("Hovering over the language icon");
        WebElement languageIcon = driver.findElement(By.xpath(LANGUAGE_ICON_XPATH));
        Actions hoverOverTheLanguage = new Actions(driver);
        hoverOverTheLanguage.moveToElement(languageIcon).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LANGUAGE_HOVER_MASSAGE)));
        LOGGER.debug("Finished hovering over the language icon");
    }

}