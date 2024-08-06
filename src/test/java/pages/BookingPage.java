//package pages;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//
//public class BookingPage extends BasePage {
////    private WebDriver driver;
////    private WebDriverWait wait;
////
////    public BookingPage(WebDriver driver) {
////        super(driver);
////    }
////
////    public void openBookingHomePage() {
////        driver.get("https://www.booking.com/");
////    }
////
////    public void acceptCookies() {
////        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='onetrust-button-group']//button[2]"))).click();
////    }
////
////    public void dismissSignInModal() {
////        try {
////            WebElement signInOrRegister = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
////            if (signInOrRegister.isDisplayed()) {
////                WebElement dismissButton = driver.findElement(By.xpath("//div[@role='dialog']//*[@aria-label='Dismiss sign-in info.']"));
////                Actions actions = new Actions(driver);
////                actions.moveToElement(dismissButton).click().perform();
////            }
////        } catch (Exception e) {
////            System.out.println("Modal didn't appear or could not be closed using click: " + e.getMessage());
////            try {
////                Actions actions = new Actions(driver);
////                actions.sendKeys(Keys.ESCAPE).perform();
////                System.out.println("ESC key was sent to dismiss modal.");
////            } catch (Exception escException) {
////                System.out.println("Could not send ESC key: " + escException.getMessage());
////            }
////        }
//    }
//
//    public void searchDestination(String destination) {
//        WebElement searchField = driver.findElement(By.xpath("//div[@id='indexsearch']//*[@placeholder='Where are you going?']"));
//        searchField.click();
//        searchField.clear();
//        searchField.sendKeys(destination);
//
//        WebElement requiredOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']//ul[@role='group']//li[1]//div[contains(.,'Чешка република')]")));
//        requiredOption.click();
//
//        driver.findElement(By.xpath("//div[@data-testid='searchbox-layout-wide']//button[@type='submit']")).click();
//    }
//
//    public void sortByRating() {
//        try {
//            WebElement sortDropdown = driver.findElement(By.xpath("//button[@data-testid='sorters-dropdown-trigger']//span[1]"));
//            sortDropdown.click();
//
//            WebElement sortOption = driver.findElement(By.xpath("//div[@data-testid='sorters-dropdown']//*[text()='Property rating (high to low)']"));
//            sortOption.click();
//        } catch (Exception e) {
//            System.out.println("Could not select sort option: " + e.getMessage());
//        }
//    }
//
//    public void clickFirstHotel() {
//        try {
//            WebElement listOfSortedHotels = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='property-card'][1]")));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listOfSortedHotels);
//
//            Actions actions = new Actions(driver);
//            actions.moveToElement(listOfSortedHotels).click().perform();
//        } catch (Exception e) {
//            System.out.println("Could not click on the sorted hotel: " + e.getMessage());
//        }
//    }
//}