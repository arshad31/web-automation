package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_007_Slider;
import pageObjectPackage.PO_008_Keyboard_Event;

import java.time.Duration;

public class TC008_KeyboardEvent extends BaseDriver {
    public static String baseUrl = "https://www.google.com/";
    @Test
    public static void keyboardEvent() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(5));

        // Object creation of PO_003_DropDown Class
        PO_008_Keyboard_Event search = new PO_008_Keyboard_Event(driver);

        //Method call
        search.insertTextToSearch();
        Thread.sleep(3000);

    }
}
