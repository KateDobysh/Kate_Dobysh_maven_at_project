package classwork_cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BookingLondon {
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
        searchField.sendKeys("London");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement dropdownListLondon = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//li[@id='autocomplete-result-0']//*[text()='London']")));
        dropdownListLondon.click();

        try {
            signInOrRegister = waitModal.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//div[@role='dialog']")));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            if (signInOrRegister.isDisplayed()) {
                driver.findElement(By
                        .xpath("//div[@role='dialog']//*[@aria-label='Dismiss sign-in info.']")).click();
            }
        } catch (Exception e) {
            System.out.println("Modal didn't appear" + e.getMessage());
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[@type='submit']//span[text()='Search']")).click();

        try {
            WebElement tenthElementFromTop = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//div[@data-testid='property-card'][10]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tenthElementFromTop);
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", tenthElementFromTop);
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", tenthElementFromTop);
        } catch (Exception e) {
            System.out.println("Element not found: " + e.getMessage());
        }
    }
}