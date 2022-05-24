package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_001_radioAndCheckboxInFrame {
	
	WebDriver driver = null;
	
	//Constructor creation 
	public PO_001_radioAndCheckboxInFrame(WebDriver driver) {
		this.driver = driver;
	}
	
	//Variable to get web element from the page
	By clickOnParisRadioButton = By.xpath("//label[normalize-space()='Paris']");
	By checkQueenOne = By.xpath("//label[normalize-space()='1 Queen']");
	By checkFiveStar = By.xpath("//label[normalize-space()='5 Star']");
	By uncheckFiveStar = By.xpath("//label[normalize-space()='5 Star']");
	
	
	//Method to perform action in the page
	
	public void clickOnParisRadio() {           // For Radio Button
		driver.findElement(clickOnParisRadioButton).click();;
	}
	
	public void checkQueenOneOption() {        //To Select Queen One Option
		driver.findElement(checkQueenOne).click();;
	}
	
	public void checkFiveStarOption() {        //To Select Five Star Option
		driver.findElement(checkFiveStar).click();;
	}
	
	public void uncheckFiveStarOption() {        //To Deselect Five Star Option
		driver.findElement(uncheckFiveStar).click();;
	}

}
