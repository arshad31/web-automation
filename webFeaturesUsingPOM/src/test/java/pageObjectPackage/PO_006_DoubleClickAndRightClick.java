package pageObjectPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PO_006_DoubleClickAndRightClick {
    WebDriver driver = null;
    Actions act;


    //Constructor creation
    public PO_006_DoubleClickAndRightClick(WebDriver driver) {
        this.driver = driver;
        this.act = new Actions(driver);
    }
    //Actions act = new Actions(driver);

    //Variable to get web element from the page
    By location = By.xpath("//p[2]");

    //Method to perform action in the page
    public void doubleClick(){  // Double click
        WebElement element = driver.findElement(location);
        act.doubleClick(element).build().perform();
    }
    public void rightClick(){     //Right click
        WebElement element = driver.findElement(location);
        act.contextClick(element).build().perform();
    }

}
