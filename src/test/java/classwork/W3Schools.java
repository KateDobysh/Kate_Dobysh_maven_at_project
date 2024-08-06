package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class W3Schools {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/java/");
        driver.findElement(By.xpath("//div[@id='accept-choices']")).click();

        WebElement tutorialText = driver.findElement(By.xpath("//span[@class='color_h1']"));
        Actions make = new Actions(driver);
        make.doubleClick(tutorialText).perform();
        make.doubleClick(tutorialText).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[(text()='Odrzuć wszystko')] ")).click();
        driver.findElement(By.xpath("//textarea[@title='Szukaj']")).click();
        make.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        make.sendKeys(Keys.ENTER).perform();
    }
}