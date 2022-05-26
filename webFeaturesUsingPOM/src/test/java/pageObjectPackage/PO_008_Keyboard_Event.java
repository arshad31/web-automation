package pageObjectPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PO_008_Keyboard_Event {
    WebDriver driver = null;

    //Constructor creation
    public PO_008_Keyboard_Event(WebDriver driver) {
        this.driver = driver;
    }

    //Variable to get web element from the page
    By fieldLocation = By.name("q");

    //Method to perform action in the page
    public void insertTextToSearch() throws InterruptedException {  // Vertical slider
        WebElement element = driver.findElement(fieldLocation);
        Thread.sleep(3000);
        element.sendKeys(Keys.chord(Keys.SHIFT,"ada lovelace"));
        Thread.sleep(3000);
        element.sendKeys(Keys.chord(Keys.ENTER));
    }


}
