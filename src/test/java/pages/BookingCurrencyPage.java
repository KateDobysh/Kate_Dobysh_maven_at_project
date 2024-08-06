package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingCurrencyPage extends BasePage {

    public static final String CURRENCY_ICON_XPATH = ("//button[@data-testid='header-currency-picker-trigger']");
    public static final String LANGUAGE_ICON_XPATH = ("//img[@src='https://t-cf.bstatic.com/design-assets/assets/v3.122.0/images-flags/Us@3x.png']");
    public static final String CURRENCY_HOVER_MESSAGE = ("//*[text()='Select your currency']");
    public static final String LANGUAGE_HOVER_MASSAGE = ("//*[text()='Select your language']");

    public void open(String url) {
        driver.get(url);
    }

    public void hoverOverTheCurrency() {
        WebElement currencyIcon = driver.findElement(By.xpath(CURRENCY_ICON_XPATH));
        Actions hoverOverTheCurrency = new Actions(driver);
        hoverOverTheCurrency.moveToElement(currencyIcon).perform();
    }

    public void hoverOverTheLanguage() {
        WebElement languageIcon = driver.findElement(By.xpath(LANGUAGE_ICON_XPATH));
        Actions hoverOverTheLanguage = new Actions(driver);
        hoverOverTheLanguage.moveToElement(languageIcon).perform();
    }
}