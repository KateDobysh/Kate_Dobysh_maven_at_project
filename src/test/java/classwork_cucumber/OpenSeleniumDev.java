package classwork_cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class OpenSeleniumDev {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev");
    }
}