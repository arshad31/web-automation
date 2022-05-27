package pageObjectPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PO_0010_DragAndDrop {
    WebDriver driver = null;
    Actions act;


    //Constructor creation
    public PO_0010_DragAndDrop(WebDriver driver) {
        this.driver = driver;
        this.act = new Actions(driver);
    }
    //Actions act = new Actions(driver);

    //Variable to get web element from the page
    By drag = By.xpath("//div[@id='draggable']");
    By drop = By.xpath("//div[@id='droppable']");

    //Method to perform action in the page
    public void dragAndDrop() throws InterruptedException {  // Drag and Drop
        WebElement dragElement = driver.findElement(drag);
        WebElement dropElement = driver.findElement(drop);
        act.dragAndDrop(dragElement, dropElement).build().perform();
    }

}
