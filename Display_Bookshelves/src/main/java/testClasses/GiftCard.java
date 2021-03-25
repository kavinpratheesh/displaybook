package testClasses;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.JavascriptExecutor;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.*;

public class GiftCard extends BaseUI
{
	
	@Test
	public void testForGiftCards() throws InterruptedException
	{
	   	logger = report.createTest("Test 4 ::Gift Cards");
	   	
		invokeBrowser();						// Invoke the browser
		openURL("websiteURL");							// Open Application
		Thread.sleep(3000);
		elementClick("gift_card_link_Xpath");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		elementClick("gift_for_aniversaryorbirthday_Xpath");
		
		Thread.sleep(2000);
		enterText("amount_Xpath","2000");
		mouseHoverAndSelect("month_drop_down_Xpath","Apr(2021)");
		mouseHoverAndSelect("date_drop_down_Xpath","14");
		elementClick("click_on_next_Xpath");
		enterText("recipient_name_Xpath","Nagapriyadharsini");
		enterText("recipient_email_Xpath","Kavin");
		enterText("sender_name_Xpath","Gowtham");
		enterText("sender_email_Xpath","priyadharshini@gmail.com");
		enterText("sender_phone_Xpath","9876543210");
		enterText("message_Xpath","Hello, Deepika and Naveena");
		
		Thread.sleep(1000);
		elementClick("confirm_Xpath");
		Thread.sleep(2000);

	    validateResult("validate_payment_Xpath");
		
	    System.out.println("Screenshot of the error message is captured Successfully");
		
		quitBrowser();
	}
		
	
}
