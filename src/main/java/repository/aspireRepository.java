package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import codeChallenge.actionsMethods;

public class aspireRepository
{		
	public static By header_Item_link = By.xpath("//section//div[contains(@class,'feature-card')]//h1/a");
	public static By headline_Page_Title_lbl = By.xpath("//section//div[contains(@class,'content-detail')]//h1");
	
	public static By s2_ex_all_lbl = By.xpath("//li/span[contains(text(),'All Sections')]");
	public static By s2_top_stories_lbl = By.xpath("(//li/a[contains(text(),'Top Stories')])[2]");
	public static By s2_singapore_link = By.xpath("(//li/a[@href='/singapore'])[4]");
	public static By s2_singapore_page_ele = By.xpath("//section[contains(@class,'block')]//h1/span");
	
	public static By s2_weather_lbl = By.xpath("(//li/a[contains(text(),'Weather')])[2]");
	
	public static By s2_weather_city_condition = By.xpath("//div[contains(@class,'city')][contains(text(),'kuala lumpur')]/following-sibling::div");
	public static By s2_weather_city_maxtemp = By.xpath("//div[contains(@class,'city')][contains(text(),'kuala lumpur')]/parent::div/following-sibling::div/span[1]");
	public static By s2_weather_city_mintemp = By.xpath("//div[contains(@class,'city')][contains(text(),'kuala lumpur')]/parent::div/following-sibling::div/span[2]");

	
	
}
