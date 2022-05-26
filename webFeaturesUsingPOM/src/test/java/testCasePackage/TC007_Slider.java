package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_006_DoubleClickAndRightClick;
import pageObjectPackage.PO_007_Slider;

import java.time.Duration;

public class TC007_Slider extends BaseDriver {
    public static String baseUrl = "https://jqueryui.com/slider/";
    @Test
    public static void doubleClickAndRightClick() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(5));

        // Object creation of PO_003_DropDown Class
        PO_007_Slider slider = new PO_007_Slider(driver);

        //Method call
        driver.switchTo().frame(0);
        slider.verticalSlider();
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        slider.switchToHorizontalSliderPage();
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        slider.horizontalSlider();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
