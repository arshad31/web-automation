package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_006_DoubleClickAndRightClick;

import java.time.Duration;

public class TC006_DoubleClickAndRightClick extends BaseDriver {
    public static String baseUrl = "https://en.wikipedia.org/wiki/Bangladesh";
    @Test
    public static void doubleClickAndRightClick() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(5));

        // Object creation of PO_003_DropDown Class
        PO_006_DoubleClickAndRightClick click = new PO_006_DoubleClickAndRightClick(driver);

        //Method call
        click.doubleClick();
        Thread.sleep(3000);
        click.rightClick();
        Thread.sleep(3000);

    }
}
