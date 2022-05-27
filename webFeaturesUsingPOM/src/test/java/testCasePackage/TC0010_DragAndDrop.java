package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_0010_DragAndDrop;

import java.time.Duration;

public class TC0010_DragAndDrop extends BaseDriver {
    public static String baseUrl = "https://jqueryui.com/droppable/";
    @Test
    public static void dragAndDropCheck() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(5));

        // Object creation of PO_003_DropDown Class
        PO_0010_DragAndDrop dragdrop = new PO_0010_DragAndDrop(driver);

        //Method call
        driver.switchTo().frame(0);
        dragdrop.dragAndDrop();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
