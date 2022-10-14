package com.fatura.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fatura.base.TestBase;
import com.fatura.pages.FAQsPage;
import com.fatura.pages.SearchPage;


public class FAQsPageTest extends TestBase {

	public FAQsPageTest() throws IOException {
		super();
		
	}
	
	 FAQsPage FAQs;
	 
	 
	 // TestCase of Getting No of Questions
	 
	 @Test (priority = 2)
	 
	 public void ClickingOnFAQs() throws InterruptedException, IOException, AWTException {
		 

			
			
			
		
			
		SearchPage SearchPageTest = new SearchPage();
			SearchPageTest.NavigateToHome();
			
			 
			  
			// calling navigate function to navigate to FAQs Page
			  
		  String actualResult = String.valueOf(FAQs.navigateToFAQs());
				
			
			// assert steps to assert that the title of the page is matching expected result
		  
		  
			String expectedResult = "Frequently asked questions - Deliveroo";
		     Assert.assertEquals(actualResult, expectedResult,"Title is not the same");
			
			
			
	 }
	
	
		
	 @Parameters({"browser"})
	 @BeforeMethod
	 
	 //Before method and intialize browser 
	 	
	 	public void beforeSetup(String browser) throws IOException, InterruptedException {
	 		
	 		intial(browser);
	 		

	 		
	 		
	 	FAQs = new FAQsPage();
	 	}
	 	
	    @AfterMethod
	    
	    // after method to close browser
	 	
	    public void tearDown() throws IOException {
	 	   
			  driver.quit();
			  
			   
		 }
	 	

}
