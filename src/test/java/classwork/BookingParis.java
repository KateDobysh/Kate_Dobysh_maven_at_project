package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookingParis {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        driver.findElement(By.xpath("//div[@id='onetrust-button-group']//button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait waitModal = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement signInOrRegister;
        try {
            signInOrRegister = waitModal.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            if (signInOrRegister.isDisplayed()) {
                driver.findElement(By.xpath("//div[@role='dialog']//*[@aria-label='Dismiss sign-in info.']")).click();
            }
        } catch (Exception e) {
            System.out.println("Modal didn't appear" + e.getMessage());
        }
        WebElement searchField = driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys("Париж");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement requiredOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//ul[@role='group']//li[1]//div[contains(.,'Франция')]")));
        requiredOption.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try {
            signInOrRegister = waitModal.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
            if (signInOrRegister.isDisplayed()) {
                driver.findElement(By.xpath("//div[@role='dialog']//*[@aria-label='Dismiss sign-in info.']")).click();
            }
        } catch (Exception e) {
            System.out.println("Modal didn't appear" + e.getMessage());
        }

        LocalDate currentDate = LocalDate.now();
        LocalDate currentPlusThreeDays = currentDate.plusDays(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        String formattedCurrentDate = currentDate.format(formatter);
        String formattedDateWithAddedDays = currentPlusThreeDays.format(formatter);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

        WebDriverWait waitDatePicker = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement datePickerDisplayed = waitDatePicker.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@role='gridcell']//span[text()='" + formattedCurrentDate + "']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datePickerDisplayed);

        WebDriverWait waitNextDate = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement nextDate = waitNextDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@role='gridcell']//span[text()='" + formattedDateWithAddedDays + "']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextDate);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By
                .xpath("//button[@data-testid='occupancy-config']")).click();

        WebElement numberOfPeople = driver.findElement(By
                .xpath("//div[@data-testid='occupancy-popup']//div[1]//button[2]"));
        numberOfPeople.click();
        numberOfPeople.click();

        WebElement numberOfRooms = driver.findElement(By
                .xpath("//div[@data-testid='occupancy-popup']//div[3]//button[2]"));
        numberOfRooms.click();

        driver.findElement(By
                .xpath("//div[@data-testid='occupancy-popup']//*[text()='Done']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        try {
            signInOrRegister = waitModal.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//div[@role='dialog']")));

            if (signInOrRegister.isDisplayed()) {
                driver.findElement(By
                        .xpath("//div[@role='dialog']//*[@aria-label='Dismiss sign-in info.']")).click();
            }
        } catch (Exception e) {
            System.out.println("Modal didn't appear" + e.getMessage());
        }
        driver.findElement(By
                .xpath("//div[@data-testid='searchbox-layout-wide']//button[@type='submit']")).click();

        WebDriverWait waitCheckbox = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement checkBoxAppeared = waitCheckbox.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//div[@id='popular-filters-go-here']//preceding-sibling::div[@data-testid='filters-sidebar']//div[@data-filters-group='ht_id']//div[text()='Hotels']")));
        checkBoxAppeared.click();

        WebDriverWait waitHotelRateCheckbox = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement checkBoxHotelRateAppeared = waitHotelRateCheckbox.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='filter_group_review_score_:r22:']//div[@data-filters-item='review_score:review_score=90'][1]//label[@for=':r23:']//span[2]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBoxHotelRateAppeared);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@id='filter_group_class_:r2m:']//div[13]//span[2]")).click();
        driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']//span[1]")).click();
        driver.findElement(By.xpath("//*[@Price (lowest first)]")).click();
    }
}