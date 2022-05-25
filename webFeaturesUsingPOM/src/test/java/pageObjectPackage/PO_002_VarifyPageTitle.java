package pageObjectPackage;

import org.openqa.selenium.WebDriver;

public class PO_002_VarifyPageTitle {
	
	WebDriver driver = null;
	
	//Constructor creation 
	public PO_002_VarifyPageTitle(WebDriver driver) {
		this.driver = driver;
	}

	//Variable to get web element from the page
	String pageTitle = driver.getTitle();

	//Method to perform action in the page
	public void getPageTitle() {
		System.out.println(pageTitle);
	}

}
