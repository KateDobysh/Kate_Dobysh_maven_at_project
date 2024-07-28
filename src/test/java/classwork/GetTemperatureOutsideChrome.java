package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTemperatureOutsideChrome {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[(text()='Odrzuć wszystko')] ")).click();
        driver.findElement(By.name("q")).sendKeys("погода минск");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='погода минск']")).click();
        driver.findElement(By.xpath("//a[text()='Завтра']")).click();
        WebElement element = driver.findElement(By.xpath("//*[@class='values']//div[@class='value'][5]/temperature-value"));
        System.out.println("Температура завтра: " + element.getText());
    }
}