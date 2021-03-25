package testClasses;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.BaseUI;
import output.ShowOutputInConsole;
import output.ShowOutputInExcel;

public class GetHomeItems extends BaseUI 
{
	@Test
	public void getHomeListItems_one() throws InterruptedException, IOException		//test case to be passed
	{
	   	logger = report.createTest("Test 2 :: HomeListItems");			// Point to report using instances

		invokeBrowser();											// Invoke the browser
		openURL("websiteURL");											// open Websites
		Thread.sleep(3000);
		List<String> listitem=mouseclickAndSelectElements("collection_menu_Xpath","item_Xpath");	// select menu list
		quitBrowser();
		
		ShowOutputInConsole soic = new ShowOutputInConsole();			
		soic.printMenuList(listitem);									// show output in console
		
		ShowOutputInExcel soie = new ShowOutputInExcel();
		soie.showMenuInExcel(listitem);									// show output in Excels
		
		quitBrowser();
	}
	
	@AfterTest
	public void endReport()
	{
		report.flush();													// flush the report
	}
}
