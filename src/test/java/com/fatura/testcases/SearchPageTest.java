package com.fatura.testcases;


import java.awt.AWTException;
import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fatura.base.TestBase;
import com.fatura.pages.SearchPage;







public class SearchPageTest extends TestBase {
	
	
	
	
	public SearchPageTest() throws IOException {
		super();
	}
	
	

	
	
	SearchPage searchPage;
	



	// first test case clicking on EN language
	
	@Test (priority = 1)
	 
	public void Search() throws InterruptedException, IOException, AWTException   {
		

		// calling function to click on EN language
		searchPage.SearchAndGetMatchingResult();
		
		//assertion to compare current URL with expected result
		
		 String expectedResult = "https://deliveroo.co.uk/restaurants/liverpool/liverpool-city-centre?fulfillment_method=DELIVERY&geohash=gcmzgftw761c";
		 
		 String actualResult = driver.getCurrentUrl();
			
	Assert.assertEquals(actualResult, expectedResult,"it was failure because the expected result is not https://deliveroo.co.uk/restaurants/liverpool/liverpool-city-centre?fulfillment_method=DELIVERY&geohash=gcmzgftw761c");
		
		
		
	}
	
	
	@Parameters({"browser"})
	@BeforeMethod
	
	//Before method and intialize browser 
 	
	
		public void beforeSetup(String browser) throws IOException {
			
			intial(browser);
			

			
			
		 searchPage = new SearchPage();
		}

	
	
		
	

	
   @AfterMethod
	
   public void tearDown() throws IOException {
	   
	   // after method to close browser
	   
		  driver.quit();
		  
		   
	 }
	  
	
	
	

}
