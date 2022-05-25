package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_004_Refresh;

import java.time.Duration;

public class TC004_Refresh extends BaseDriver {
    public static String baseUrl = "https://www.w3schools.com/";
    @Test
    public static void refreshPage() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(5));

        // Object creation of PO_003_DropDown Class
        PO_004_Refresh refresh = new PO_004_Refresh(driver);

        //Method call
        refresh.refresh();
        Thread.sleep(5000);

    }
}
