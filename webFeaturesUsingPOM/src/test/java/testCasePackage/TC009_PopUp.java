package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_009_PopUp;

import java.time.Duration;

public class TC009_PopUp extends BaseDriver {
    public static String baseUrl = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
    @Test
    public static void keyboardEvent() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(5));

        // Object creation of PO_003_DropDown Class
        PO_009_PopUp popup = new PO_009_PopUp(driver);

        //Switch to Frame
        driver.switchTo().frame("iframeResult");

        //Method call
        popup.handlingAlert();
        Thread.sleep(3000);

        // Back from frame
        driver.switchTo().defaultContent();

    }
}
