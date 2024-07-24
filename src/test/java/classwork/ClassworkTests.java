package classwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class ClassworkTests {
    public static void main(String[] args) throws MalformedURLException {
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
//                new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());
        driver.get("https://selenium.dev");
    }
}