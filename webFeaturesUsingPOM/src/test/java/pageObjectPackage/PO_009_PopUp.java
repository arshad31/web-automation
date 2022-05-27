package pageObjectPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PO_009_PopUp {
    WebDriver driver = null;

    //Constructor creation
    public PO_009_PopUp(WebDriver driver) {
        this.driver = driver;
    }

    //Variable to get web element from the page
    By locator = By.xpath("//button[text()='Try it']");

    //Method to perform action in the page
    public void handlingAlert() throws InterruptedException {  // Handle alert
        driver.findElement(locator).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
    }

}
