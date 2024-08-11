package tests;

import driver.Driver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BookingCurrencyPage;
import static pages.BookingCurrencyPage.CURRENCY_HOVER_MESSAGE;
import static pages.BookingCurrencyPage.LANGUAGE_HOVER_MASSAGE;

public class BookingCurrencyTest extends BasePageTest{

    private BookingCurrencyPage bookingCurrencyPage;

    @Before
    public void setUp(){
        Driver.getDriver();
        bookingCurrencyPage = new BookingCurrencyPage(Driver.getDriver());
    }

    @Test
    public void currencyIconExists(){
        bookingCurrencyPage.open("https://www.booking.com/");
        bookingCurrencyPage.currencyIconOnThePage();
        Assert.assertTrue("Language icon exists on the page", bookingCurrencyPage.currencyIconOnThePage());
    }

    @Test
    public void currencyIconCanBeHovered(){
        bookingCurrencyPage.open("https://www.booking.com/");
        bookingCurrencyPage.hoverOverTheCurrency();
        WebElement hoverCurrencyText = driver.findElement(By.xpath(CURRENCY_HOVER_MESSAGE));
        Assert.assertTrue("Hovering works well", hoverCurrencyText.isDisplayed());
    }

    @Test
    public void languageIconExists(){
        bookingCurrencyPage.open("https://www.booking.com/");
        bookingCurrencyPage.currencyIconOnThePage();
        Assert.assertTrue("Language icon exists on the page", bookingCurrencyPage.languageIconOnThePage());
    }

    @Test
    public void languageIconCanBeHovered() {
        bookingCurrencyPage.open("https://www.booking.com/");
        bookingCurrencyPage.hoverOverTheLanguage();
        WebElement hoverLanguageText = driver.findElement(By.xpath(LANGUAGE_HOVER_MASSAGE));
        Assert.assertTrue("Hovering works well", hoverLanguageText.isDisplayed());
    }
}