package steps;

import driver.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookingCurrencyPage;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BookingStep {

    private static final Logger logger = LogManager.getLogger(BookingStep.class);
    private BookingCurrencyPage bookingCurrencyPage;

    @Given("Open booking website")
    public void open_booking_website() {

        logger.info("Initializing the WebDriver and opening the Booking website");
        bookingCurrencyPage = new BookingCurrencyPage();
        String url = "https://www.booking.com/";
        bookingCurrencyPage.open(url);
        logger.info("Opening url: " + url);
    }

    @When("the currency icon is on the page")
    public void the_currency_icon_is_on_the_page() {
        logger.info("Checking if the currency icon is visible");
        Assert.assertTrue("Currency icon is not visible", bookingCurrencyPage.currencyIconOnThePage());
    }

    @Then("I hover over the currency")
    public void i_hover_over_the_currency() {
        logger.info("Hovering over the currency icon");
        bookingCurrencyPage.hoverOverTheCurrency();
    }

    @When("the language icon is on the page")
    public void the_language_icon_is_on_the_page() {
        logger.info("Checking if the language icon is visible");
        Assert.assertTrue("Language icon is visible", bookingCurrencyPage.languageIconOnThePage());
    }

    @Then("I hover over the language")
    public void i_hover_over_the_language(){
        logger.info("Hovering over the language icon");
        bookingCurrencyPage.hoverOverTheLanguage();
    }
}