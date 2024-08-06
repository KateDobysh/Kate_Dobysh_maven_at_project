package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DemoqaSelectMenuPage extends BasePage{
//    private WebDriver driver;
//    private WebDriverWait wait;
//
//    public DemoqaSelectMenuPage(WebDriver driver) {
//        super(driver);
//    }
//
//    public void navigateToSelectMenuPage() {
//        driver.get("https://demoqa.com/select-menu");
//    }
//
//    public void selectGroupOption() {
//        WebElement selectValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("withOptGroup")));
//        selectValue.click();
//        WebElement selectFirst = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Group 2, option 1']")));
//        selectFirst.click();
//    }
//
//    public void selectTitle(String title) {
//        WebElement selectOne = driver.findElement(By.id("selectOne"));
//        selectOne.click();
//        WebElement selectTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='" + title + "']")));
//        selectTitle.click();
//    }
//
//    public void selectOldStyleOption(String color) {
//        WebElement oldStyleSelectMenu = driver.findElement(By.id("oldSelectMenu"));
//        oldStyleSelectMenu.click();
//        WebElement selectColor = driver.findElement(By.xpath("//option[@value='" + color.toLowerCase() + "']"));
//        selectColor.click();
//    }
//
//    public void selectMultiOption(String option) {
//        try {
//            WebElement multiSelectDropDown = driver.findElement(By.xpath("//div[contains(@class, 'css-1wa3eu0-placeholder')]"));
//            multiSelectDropDown.click();
//            WebElement selectOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'" + option + "')]")));
//            selectOption.click();
//        } catch (Exception e) {
//            System.out.println("Element wasn't found or clicked: " + e.getMessage());
//        }
//    }
//
//    public void selectStandardMultiOption(String... options) {
//        try {
//            WebElement standardMultiSelect = driver.findElement(By.xpath("//select[@name='cars']"));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", standardMultiSelect);
//
//            Select multiSelect = new Select(standardMultiSelect);
//            for (String option : options) {
//                multiSelect.selectByValue(option.toLowerCase());
//            }
//        } catch (Exception e) {
//            System.out.println("Couldn't select an element: " + e.getMessage());
//        }
//    }
}