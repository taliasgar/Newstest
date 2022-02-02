package codeChallenge;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Automated_Scenarios extends actionsMethods
{
	@Test(priority = 0,groups = {"prerequisites" })
	public static void Scenario_01() throws Exception
	{
		String URL=getPropertyValue("env-url");
		try {
			String fetchHomePageHeadLine = "";
			String fetchHeadLine_Page_title = "";
			System.out.println(" - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(" - - - - - START : S1 - - - - ");
			System.out.println(" - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			rep_CreateTest("News Channel Home Page");
			openURL(URL);
			waitForElementVisibility(header_Item_link);
			rep_AddLogWithScreenShot("Pass", "Successfully Opened into "+URL, web_TakeScreenShot());
			fetchHomePageHeadLine = driver.findElement(header_Item_link).getText();
			click(header_Item_link);
			waitForElementVisibility(headline_Page_Title_lbl);
			fetchHeadLine_Page_title = driver.findElement(headline_Page_Title_lbl).getText();
			assertEquals(fetchHomePageHeadLine, fetchHomePageHeadLine, "Test Case Passed");
			rep_AddLogWithScreenShot("Pass", "Landed on HeadLine Page", web_TakeScreenShot());
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(" - - - - - END : S1 - - - - ");
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			rep_AddLogWithScreenShot("Fail", "Failed while Login, Log: "+e.getMessage(), web_TakeScreenShot());
			assertTrue(false, "Unxpected Error on "+URL);
		}

	}
	@Test(priority = 1,groups = {"prerequisites" })
	public static void Scenario_02() throws Exception
	{
		String URL="https://www.channelnewsasia.com/news/international";
		try {
			String expectedselection = "Singapore";
			System.out.println(" - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(" - - - - - START : S2 - - - - ");
			System.out.println(" - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			rep_CreateTest("News Channel Home Page");
			openURL(URL);
			waitForElementVisibility(s2_ex_all_lbl);

			rep_AddLogWithScreenShot("Pass", "Successfully Opened into "+URL, web_TakeScreenShot());
			click(s2_ex_all_lbl);
			Thread.sleep(2000);
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(s2_ex_all_lbl)).perform();
			click(s2_singapore_link);
			waitForElementVisibility(s2_singapore_page_ele);
			String actual_fetched_data = driver.findElement(s2_singapore_page_ele).getText();
			actual_fetched_data=actual_fetched_data.trim();
			assertEquals(expectedselection.toLowerCase(), actual_fetched_data.toLowerCase(), "Test Case Passed");
			rep_AddLogWithScreenShot("Pass", "Landed on HeadLine Page", web_TakeScreenShot());
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(" - - - - - END : S2 - - - - ");
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			rep_AddLogWithScreenShot("Fail", "Failed while Login, Log: "+e.getMessage(), web_TakeScreenShot());
			assertTrue(false, "Unxpected Error on "+URL);
		}

	}
	@Test(priority = 2,groups = {"prerequisites" })
	public static void Scenario_03() throws Exception
	{
		String URL="https://www.channelnewsasia.com/news/international";
		try {
			System.out.println(" - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(" - - - - - START : S3 - - - - ");
			System.out.println(" - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			rep_CreateTest("News Channel Home Page");
			openURL(URL);
			waitForElementVisibility(s2_ex_all_lbl);

			rep_AddLogWithScreenShot("Pass", "Successfully Opened into "+URL, web_TakeScreenShot());
			click(s2_ex_all_lbl);
			Thread.sleep(2000);

			
			Actions ac = new Actions(driver);
			ac.moveToElement(driver.findElement(s2_weather_lbl)).perform();
			
			click(s2_weather_lbl);
			
			
			ac.moveToElement(driver.findElement(s2_weather_city_condition)).perform();
					
			String KL_weather_condition = driver.findElement(s2_weather_city_condition).getText();
			String KL_weather_max_temp = driver.findElement(s2_weather_city_maxtemp).getText();
			String KL_weather_min_temp = driver.findElement(s2_weather_city_mintemp).getText();
			
			rep_AddLogWithScreenShot("Pass", "Kaula Lumpur Weather Condition :"+KL_weather_condition, web_TakeScreenShot());
			rep_AddLogWithScreenShot("Pass", "Kaula Lumpur Weather Max Temp. :"+KL_weather_max_temp, web_TakeScreenShot());
			rep_AddLogWithScreenShot("Pass", "Kaula Lumpur Weather Min Temp. :"+KL_weather_min_temp, web_TakeScreenShot());
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println(" - - - - - END : S3 - - - - ");
			System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			rep_AddLogWithScreenShot("Fail", "Failed while Login, Log: "+e.getMessage(), web_TakeScreenShot());
			assertTrue(false, "Unxpected Error on "+URL);
		}

	}
}
