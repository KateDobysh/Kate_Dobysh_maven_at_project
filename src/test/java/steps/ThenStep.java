package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookingCurrencyPage;

public class ThenStep {

    private BookingCurrencyPage bookingCurrencyPage;

    @Then("Currency icon should be visible")
    public void currencyIconShouldBeVisible() {
        Assert.assertTrue(bookingCurrencyPage.currencyIconOnThePage());
    }
}