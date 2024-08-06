package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingLondonPage extends BasePage {
//    private WebDriver driver;
//    private WebDriverWait wait;
//
//    public BookingLondonPage(WebDriver driver) {
//        super(driver);
//    }
//
//    public void openBookingHomePage() {
//        driver.get("https://www.booking.com/");
//    }
//
//    public void acceptCookies() {
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='onetrust-button-group']//button[2]"))).click();
//    }
//
//    public void dismissSignInModal() {
//        try {
//            WebElement signInOrRegister = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
//            if (signInOrRegister.isDisplayed()) {
//                driver.findElement(By.xpath("//div[@role='dialog']//*[@aria-label='Dismiss sign-in info.']")).click();
//            }
//        } catch (Exception e) {
//            System.out.println("Modal didn't appear: " + e.getMessage());
//        }
//    }
//
//    public void searchDestination(String destination) {
//        WebElement searchField = driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']"));
//        searchField.click();
//        searchField.clear();
//        searchField.sendKeys(destination);
//
//        WebElement dropdownListOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='autocomplete-result-0']//*[text()='London']")));
//        dropdownListOption.click();
//    }
//
//    public void startSearch() {
//        driver.findElement(By.xpath("//button[@type='submit']//span[text()='Search']")).click();
//    }
//
//    public void highlightTenthHotel() {
//        try {
//            WebElement tenthElementFromTop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='property-card'][10]")));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tenthElementFromTop);
//            ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", tenthElementFromTop);
//            ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", tenthElementFromTop);
//        } catch (Exception e) {
//            System.out.println("Element not found: " + e.getMessage());
//        }
//    }
}