package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage {
//    private WebDriver driver;
//    private Actions actions;
//
//    public GooglePage(WebDriver driver){
//        super(driver);
//    }
//
//    private By rejectAllButtonLocator = By.xpath("//div[(text()='Отклонить все')]");
//    private By searchBoxLocator = By.name("q");
//    private By weatherResultLocator = By.xpath("//div[@aria-label='погода минск']");
//    private By tomorrowTabLocator = By.xpath("//a[text()='Завтра']");
//    private By temperatureElementLocator = By.xpath("//*[@class='values']//div[@class='value'][5]/temperature-value");
//
//    @FindBy(xpath = "//div[(text()='Odrzuć wszystko')]")
//    private WebElement rejectAllButton;
//
//    @FindBy(xpath = "//textarea[@title='Szukaj']")
//    private WebElement searchBox;
//
//    public void rejectCookies() {
//        driver.findElement(rejectAllButtonLocator).click();
//    }
//
//    public void pasteVandSearch() {
//        searchBox.click();
//        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//        actions.sendKeys(Keys.ENTER).perform();
//    }
//
//    public void navigateTo(String url) {
//        driver.navigate().to(url);
//    }
//
//    public void refreshPage() {
//        driver.navigate().refresh();
//    }
//
//    public void searchWeather(String location) {
//        WebElement searchBox = driver.findElement(searchBoxLocator);
//        searchBox.sendKeys("погода " + location);
//        searchBox.submit();
//    }
//
//    public void selectWeatherResult() {
//        driver.findElement(weatherResultLocator).click();
//    }
//
//    public void clickTomorrowTab() {
//        driver.findElement(tomorrowTabLocator).click();
//    }
//
//    public String getTomorrowTemperature() {
//        WebElement element = driver.findElement(temperatureElementLocator);
//        return element.getText();
//    }
//
//    public By getWeatherResultLocator() {
//        return weatherResultLocator;
//    }
//
//    public By getTomorrowTabLocator() {
//        return tomorrowTabLocator;
//    }
//
//    public WebElement getTemperatureElement() {
//        return driver.findElement(temperatureElementLocator);
//    }
}