package tests;

import driver.Driver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BookingCurrencyPage;

import static pages.BookingCurrencyPage.*;

public class BookingCurrencyTest extends BasePageTest{

    private BookingCurrencyPage bookingCurrencyPage;

    @Before
    public void setUp(){
        Driver.getDriver();
        bookingCurrencyPage = new BookingCurrencyPage();
    }

    @Test
    public void currencyIconExists(){
        bookingCurrencyPage.open("https://www.booking.com/");
        WebElement currencyIcon = driver.findElement(By.xpath(CURRENCY_ICON_XPATH));
        Assert.assertTrue("Currency icon exists on the page", currencyIcon.isDisplayed());
    }

//    @Test
//    public void currencyIconCanBeHovered(){
//        bookingCurrencyPage.open("https://www.booking.com/");
//        bookingCurrencyPage.hoverOverTheCurrency();
//        WebElement hoverCurrencyText = driver.findElement(By.xpath(CURRENCY_HOVER_MESSAGE));
//        Assert.assertTrue("Hovering works well", hoverCurrencyText.isDisplayed());
//    }

    @Test
    public void languageIconExists(){
        bookingCurrencyPage.open("https://www.booking.com/");
        WebElement languageIcon = driver.findElement(By.xpath(LANGUAGE_ICON_XPATH));
        Assert.assertTrue("Language icon exists on the page", languageIcon.isDisplayed());
    }

//    @Test
//    public void languageIconCanBeHovered() {
//        bookingCurrencyPage.open("https://www.booking.com/");
//        bookingCurrencyPage.hoverOverTheLanguage();
//        WebElement hoverLanguageText = driver.findElement(By.xpath(LANGUAGE_HOVER_MASSAGE));
//        Assert.assertTrue("Hovering works well", hoverLanguageText.isDisplayed());
//    }
}