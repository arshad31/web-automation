package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_003_DropDown;

import java.time.Duration;

public class TC003_DropDown extends BaseDriver {
    public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
    @Test
    public static void selectingValueFromDropdown() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(10));

        // Object creation of PO_003_DropDown Class
        PO_003_DropDown dropdown = new PO_003_DropDown(driver);

        driver.switchTo().frame("iframeResult"); //Enter into frame

        //select single value from dropdown
        dropdown.selectingSingleValueFromDropdown();
        Thread.sleep(5000);

        //select multiple value from dropdown
        dropdown.selectingMultipleValueFromDropdown();
        Thread.sleep(5000);

        driver.switchTo().defaultContent();  // Exit from frame
    }
}
