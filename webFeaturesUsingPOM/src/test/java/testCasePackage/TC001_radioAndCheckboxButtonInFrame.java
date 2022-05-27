package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO_001_radioAndCheckboxInFrame;

public class TC001_radioAndCheckboxButtonInFrame extends BaseDriver{
	public static String baseUrl = "https://jqueryui.com/checkboxradio";
	
	@Test
	public static void RadioAndCheckboxButtonInFrame() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Object creation of PO_001_radioAndCheckboxInFrame Class
		PO_001_radioAndCheckboxInFrame radioAndCheckboxClass = new PO_001_radioAndCheckboxInFrame(driver);
		
		//Switch to Frame
		driver.switchTo().frame(0);
		
		//Click on Paris radio button
		radioAndCheckboxClass.clickOnParisRadio();
		Thread.sleep(5000);
		
		//Select Queen One option
		radioAndCheckboxClass.checkQueenOneOption();
		Thread.sleep(5000);
		
		//Select 5 Star option
		radioAndCheckboxClass.checkFiveStarOption();
		Thread.sleep(5000);
		
		//Deselect 5 Star option
		radioAndCheckboxClass.uncheckFiveStarOption();
		Thread.sleep(5000);
		
		// Back from frame
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}

}
