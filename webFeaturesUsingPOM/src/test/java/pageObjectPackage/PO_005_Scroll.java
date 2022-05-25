package pageObjectPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class PO_005_Scroll {
    WebDriver driver = null;
    JavascriptExecutor js;
    //Constructor creation
    public PO_005_Scroll(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) this.driver;
        PageFactory.initElements(driver, this);
    }

    //Variable to get web element from the page
    //JavascriptExecutor js = (JavascriptExecutor)driver;
    By specificElement = By.xpath("//h2[normalize-space()='Top Tutorials']");

    //Method to perform action in the page
    public void scrollToBottom() {  //Scroll to Bottom

        //((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
        js.executeScript("for(let i =0;i<=document.body.scrollHeight;i=i+0.1){" +
                                   "setTimeout(function(){" +
                                       "window.scrollTo(0,i);" +
                                   "},100);" +
                               "}"
                        );
    }
    public void scrollToTop() {  //Scroll to top
        js.executeScript("for(let i = document.body.scrollHeight;i >= 0;i=i-0.1){" +
                                    "setTimeout(function(){" +
                                        "window.scrollTo(i,0);" +
                                    "},100);" +
                                "}"
                        );
    }

    public void scrollToSpecificElement() {  //Scroll to specific element
        WebElement element = driver.findElement(specificElement);
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

}
