package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingParisPage extends BasePage {
//    private WebDriver driver;
//    private WebDriverWait wait;
//
//    public BookingParisPage(WebDriver driver) {
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
//        WebElement requiredOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//ul[@role='group']//li[1]//div[contains(.,'Франция')]")));
//        requiredOption.click();
//    }
//
//    public void selectDates(int daysFromToday) {
//        LocalDate currentDate = LocalDate.now();
//        LocalDate endDate = currentDate.plusDays(daysFromToday);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
//
//        String startDate = currentDate.format(formatter);
//        String endDateString = endDate.format(formatter);
//
//        WebElement datePickerDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@role='gridcell']//span[text()='" + startDate + "']")));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datePickerDisplayed);
//
//        WebElement nextDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@role='gridcell']//span[text()='" + endDateString + "']")));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextDate);
//    }
//
//    public void configureOccupancy(int adults, int rooms) {
//        driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
//        for (int i = 1; i < adults; i++) {
//            WebElement numberOfPeople = driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']//div[1]//button[2]"));
//            numberOfPeople.click();
//        }
//
//        for (int i = 1; i < rooms; i++) {
//            WebElement numberOfRooms = driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']//div[3]//button[2]"));
//            numberOfRooms.click();
//        }
//
//        driver.findElement(By.xpath("//div[@data-testid='occupancy-popup']//*[text()='Done']")).click();
//    }
//
//    public void startSearch() {
//        driver.findElement(By.xpath("//div[@data-testid='searchbox-layout-wide']//button[@type='submit']")).click();
//    }
//
//    public void filterHotels() {
//        WebElement checkBoxAppeared = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='popular-filters-go-here']//preceding-sibling::div[@data-testid='filters-sidebar']//div[@data-filters-group='ht_id']//div[text()='Hotels']")));
//        checkBoxAppeared.click();
//
//        WebElement checkBoxHotelRateAppeared = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='filter_group_review_score_:r22:']//div[@data-filters-item='review_score:review_score=90'][1]//label[@for=':r23:']//span[2]")));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBoxHotelRateAppeared);
//
//        WebElement sortDropdown = driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']//span[1]"));
//        sortDropdown.click();
//        driver.findElement(By.xpath("//*[text()='Price (lowest first)']")).click();
//    }
}