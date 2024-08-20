package classwork.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFromBookingToYa {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().to("https://ya.ru");
        driver.navigate().to("https://google.com");
        driver.navigate().refresh();
        driver.quit();
    }
}