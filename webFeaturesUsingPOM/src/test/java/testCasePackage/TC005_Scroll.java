package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_005_Scroll;

import java.time.Duration;

public class TC005_Scroll extends BaseDriver {
    public static String baseUrl = "https://www.guru99.com/";
    @Test
    public static void scrollInPage() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(10));

        // Object creation of PO_005_Scroll Class
        PO_005_Scroll scroll = new PO_005_Scroll(driver);

        //Scroll to Bottom
        scroll.scrollToBottom();
        Thread.sleep(3000);

        //Scroll to Top
        scroll.scrollToTop();
        Thread.sleep(3000);

        //Scroll to specific element
        scroll.scrollToSpecificElement();
        Thread.sleep(3000);

    }
}
