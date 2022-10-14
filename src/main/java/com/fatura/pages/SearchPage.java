package com.fatura.pages;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fatura.base.TestBase;



public class SearchPage extends TestBase {
	
public SearchPage() throws IOException {
		
	PageFactory.initElements(driver, this);
	
	
		
	}



// inspecting elements of Search page

@FindBy (id = "location-search")

WebElement searchBoxField;




public void  NavigateToHome() {
	
	// navigating to home page
	
		 driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	
	
}




public void  SearchAndGetMatchingResult() throws AWTException, InterruptedException {
	
	NavigateToHome();
		
		// clicking on search icon
		
	
	searchBoxField.click();
	
	// sending value at the textbox field using data behavior developemnt by getting value from configuration file
	
	
	
	searchBoxField.sendKeys(prop.getProperty("searchBoxField"));
	
	// choosing the relevant result and clicking enter
	
	Thread.sleep(250);
	searchBoxField.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(500);
	searchBoxField.sendKeys(Keys.ARROW_DOWN);
	searchBoxField.sendKeys(Keys.ENTER);
	
	Thread.sleep(1000);
	
  
	
  
	





	
}




		





}





