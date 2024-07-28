package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.concurrent.locks.Condition;

public class BookingTest {
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
        WebElement signInOrRegister = waitModal.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        if (signInOrRegister.isDisplayed()) {
            driver.findElement(By.xpath("//div[@role='dialog']//*[@aria-label='Dismiss sign-in info.']")).click();
            driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']")).click();
            driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']")).clear();
        } else {
            driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']")).click();
            driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']")).clear();
        }
        driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']")).sendKeys("Париж");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement requiredOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//ul[@role='group']//li[1]")));
        requiredOption.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@class='hero-banner-searchbox']//button[@type='submit']"));
        driver.findElement((By.xpath("//div[@data-testid='searchbox-layout-wide']//span[text()='Check-in Date']"))).click();
//        LocalDate currentDate = LocalDate.now();
//        LocalDate currentPlusThreeDays = currentDate.plusDays(3);
//        driver.findElement(By.xpath("//td[@role='gridcell']//span[@data-date='"+ currentPlusThreeDays + "']")).click();

    }
}