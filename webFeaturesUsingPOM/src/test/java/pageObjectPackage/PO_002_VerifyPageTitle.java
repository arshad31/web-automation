package pageObjectPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PO_002_VerifyPageTitle {
	
	public WebDriver driver = null;
	JavascriptExecutor js;
	
	//Constructor creation 
	public PO_002_VerifyPageTitle(WebDriver driver) {
		this.driver = driver;
		//this.js = (JavascriptExecutor) this.driver;
		//PageFactory.initElements(driver, this);
	}

	//Variable to get web element from the page
	String pageTitle = driver.getTitle();//js.executeScript("return document.title;").toString();

	//Method to perform action in the page
	public void getPageTitle() {
		System.out.println(pageTitle);
	}

}
