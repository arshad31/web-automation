package pageObjectPackage;
import org.openqa.selenium.WebDriver;


public class PO_004_Refresh {
    WebDriver driver = null;

    //Constructor creation
    public PO_004_Refresh(WebDriver driver) {
        this.driver = driver;
    }

    //Variable to get web element from the page
    String url ="https://www.google.com";

    //Method to perform action in the page
    public void refresh() throws InterruptedException {
        driver.navigate().to(url);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }

}
