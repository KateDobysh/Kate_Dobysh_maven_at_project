package steps;

import io.cucumber.java.en.When;
import pages.BookingCurrencyPage;


public class WhenStep {

    private BookingCurrencyPage bookingCurrencyPage;

    @When("Hover over the currency")
    public void hoverOverTheCurrency() {
        bookingCurrencyPage.hoverOverTheCurrency();
    }
}