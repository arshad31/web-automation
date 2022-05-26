package pageObjectPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PO_007_Slider {
    WebDriver driver = null;
    Actions act;


    //Constructor creation
    public PO_007_Slider(WebDriver driver) {
        this.driver = driver;
        this.act = new Actions(driver);
    }
    //Actions act = new Actions(driver);

    //Variable to get web element from the page
    By vertical = By.xpath("/html[1]/body[1]/div[1]/span[1]");
    By horizontal = By.xpath("/html[1]/body[1]/div[1]/span[1]");
    By location = By.linkText("Vertical slider");

    //Method to perform action in the page
    public void verticalSlider() throws InterruptedException {  // Vertical slider
        WebElement verticalElement = driver.findElement(vertical);
        act.dragAndDropBy(verticalElement,300,0).build().perform();
        Thread.sleep(3000);
        act.dragAndDropBy(verticalElement,-200,0).build().perform();
    }
    public void switchToHorizontalSliderPage(){     //Go to horizontal slider page
        driver.findElement(location).click();
    }
    public void horizontalSlider() throws InterruptedException {     //Horizontal slider
        WebElement horizontalElement = driver.findElement(horizontal);
        act.dragAndDropBy(horizontalElement,0,100).build().perform();
        Thread.sleep(3000);
        act.dragAndDropBy(horizontalElement,0,-200).build().perform();
    }

}
