package com.Selenium.RoadAndFieldPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RoadAndField {
	WebDriver driver;
	
	private By moveOnElement=By.xpath("//div[@class='hidden-xs']/descendant::a[@id='corp-opp']");
	private By clickOnEnrollNow=By.xpath("//div[@class='hidden-xs']/descendant::a[contains(text(),'Enroll Now')]");
	private By searchConsultant=By.xpath("//input[@id='sponserparam']");
	private By clickOnSearch=By.xpath("//button[@id='search-sponsor-button']");
	private By clickRightArrow=By.xpath("//a[@class='next']");
	private By moveOnElement2=By.xpath("//div[@id='header']/descendant::a[@id='our-products']");
	
	private By clickOnAllProduct=By.xpath("//div[@class='hidden-xs']/descendant::a[contains(text(),'All Products')]");
	private By selectPrice=By.xpath("//input[@value='- Price -']");
			
	public RoadAndField(WebDriver driver)
	{
		this.driver=driver;
	}
	public void mouseOnElement()
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(driver.findElement(moveOnElement)).build().perform();
	}
	public void clickOnEnroll()
	{
	driver.findElement(clickOnEnrollNow).click();
	}
	public void searchConsultant()
	{
	WebElement searchField= driver.findElement(searchConsultant);
	searchField.sendKeys("Mary");
	}
	public void clickOnSearch()
	{
	driver.findElement(clickOnSearch).click();
	}
	public void clickOnRightArrow()
	{
	driver.findElement(clickRightArrow).click();
	}
	public void moveOnElement2()
	{
	Actions actions=new Actions(driver);
	actions.moveToElement(driver.findElement(moveOnElement2)).build().perform();
	}
	public void clickAllProduct()
	{
	driver.findElement(clickOnAllProduct).click();
	}
	public void selectPriceValue()
	{driver.findElement(selectPrice).click();
	}
	//driver.findElement(By.xpath("//input[@id='CAD$50 TO CAD$199.99']//preceding::div[@class='repaired-checkbox checked']")).click();
				
	

}
