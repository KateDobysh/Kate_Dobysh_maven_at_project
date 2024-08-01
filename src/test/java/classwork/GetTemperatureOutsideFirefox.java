package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTemperatureOutsideFirefox {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[(text()='Отклонить все')] ")).click();
        driver.findElement(By.name("q")).sendKeys("погода минск");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='погода минск']")).click();
        driver.findElement(By.xpath("//a[text()='Завтра']")).click();
//        System.out.println(driver.findElement(By.xpath("//*[@aria-label='24°Celsius серада 12:00']")));
        WebElement element = driver.findElement(By.xpath("//*[@class='values']//div[@class='value'][5]/temperature-value"));
        System.out.println("Температура завтра: " + element.getText());
    }
}