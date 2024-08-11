package steps;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import pages.BookingCurrencyPage;
import io.cucumber.java.en.Given;

public class GivenStep {

    private WebDriver driver;
    private BookingCurrencyPage bookingCurrencyPage;

    @Given("Open booking website")
    public void openSite() {

        driver = Driver.getDriver();
        bookingCurrencyPage = new BookingCurrencyPage(driver);

        String url = "https://booking.com";
        bookingCurrencyPage.open(url);
        System.out.println("Opening url: " + url);
    }
}