package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoqaDropdownSelect {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement selectMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//div[@id='selectMenuContainer']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectMenu);

        WebElement selectValue = driver.findElement(By.id("withOptGroup"));
        selectValue.click();
        WebElement selectFirst = driver.findElement(By.xpath("//div[text()='Group 2, option 1']"));
        selectFirst.click();

        WebElement selectOne = driver.findElement(By.id("selectOne"));
        selectOne.click();
        WebElement selectDr = driver.findElement(By.xpath("//div[text()='Dr.']"));
        selectDr.click();

        WebElement oldStyleSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        oldStyleSelectMenu.click();
        WebElement selectRed = driver.findElement(By.xpath("//option[@value='red']"));
        selectRed.click();

        try {
            WebElement multiSelectDropDown = driver.findElement(By.xpath("//div[contains(@class, 'css-1wa3eu0-placeholder')]"));
            multiSelectDropDown.click();
            WebElement selectGreen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Green')]")));
            selectGreen.click();
        } catch (Exception e) {
            System.out.println("Element wasn't found or clicked: " + e.getMessage());
        }

        try {
            WebElement standardMultiSelect = driver.findElement(By.xpath("//select[@name='cars']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", standardMultiSelect);

            Select multiSelect = new Select(standardMultiSelect);
            multiSelect.selectByValue("volvo"); // Выбор опции "Volvo"

        } catch (Exception e) {
            System.out.println("Couldn't select an element " + e.getMessage());
        }
    }
}