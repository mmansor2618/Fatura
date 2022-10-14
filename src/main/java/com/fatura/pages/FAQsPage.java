package com.fatura.pages;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.fatura.base.TestBase;




public class FAQsPage extends TestBase {

	public FAQsPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
	// inspecting elements so the user can navigate to FAQs Page
	
	@FindBy(xpath ="//a[contains(text(),'FAQs')]")

	WebElement pageFaqs;
	
	
	@FindBy(id = "onetrust-accept-btn-handler")

	WebElement acceptCookies;
	
	
	
	
	
	









	
	

public String  navigateToFAQs() throws AWTException {
	
	
	
WebDriverWait wait = new WebDriverWait(driver, 10);




    wait.until(ExpectedConditions.elementToBeClickable(acceptCookies)).click();
	wait.until(ExpectedConditions.elementToBeClickable(pageFaqs));
	pageFaqs.click();
	
	
	return driver.getTitle();
	


}
}
