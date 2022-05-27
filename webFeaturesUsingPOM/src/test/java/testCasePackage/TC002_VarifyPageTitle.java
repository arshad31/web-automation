package testCasePackage;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;
import pageObjectPackage.PO_002_VerifyPageTitle;

public class TC002_VarifyPageTitle extends BaseDriver{

	public static String baseUrl = "https://www.shohoz.com/";
	
	@Test
	public static void VarifyPageTitle() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// Object creation of PO_002_VarifyPageTitle Class
		PO_002_VerifyPageTitle pageTitleClass = new PO_002_VerifyPageTitle(driver);
		
		//Get page title
		Thread.sleep(5000);
		pageTitleClass.getPageTitle();
		Thread.sleep(3000);
		
		//driver.close();
	}

}
