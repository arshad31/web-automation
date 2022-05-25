package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PO_003_DropDown {
    WebDriver driver = null;

    //Constructor creation
    public PO_003_DropDown(WebDriver driver) {
        this.driver = driver;
    }

    //Variable to get web element from the page
    By dropdownId = By.name("cars");

    //Method to perform action in the page
    public void selectingSingleValueFromDropdown() {  // For single value
        Select option = new Select(driver.findElement(dropdownId));
        //Thread.sleep(3000);
        option.selectByIndex(3);
    }

    public void selectingMultipleValueFromDropdown() {  // For multiple value
        Select option = new Select(driver.findElement(dropdownId));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(option.getOptions().get(0)).click(option.getOptions().get(2)).keyUp(Keys.CONTROL).build().perform();
    }

}
