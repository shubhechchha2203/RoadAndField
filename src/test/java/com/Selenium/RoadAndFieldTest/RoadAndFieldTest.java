package com.Selenium.RoadAndFieldTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Selenium.RoadAndFieldPage.RoadAndField;

public class RoadAndFieldTest {
	
	WebDriver driver;
	@BeforeTest
	public void beforeExecution()
	{
		System.setProperty("webdriver.chrome.driver", "E:/Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(priority=0)
	public void testRoadAndField1() throws InterruptedException
	{
		
		driver.get("https://www.rodanandfields.com/ca");
		RoadAndField rf=new RoadAndField(driver);
		rf.mouseOnElement();
		rf.clickOnEnroll();
		//Thread.sleep(3000);
		rf.searchConsultant();
		//Thread.sleep(3000);
		rf.clickOnSearch();
		rf.clickOnRightArrow();
		String nevigationNo =driver.findElement(By.xpath("//span[contains(text(),'2')]")).getText();
		Assert.assertEquals(nevigationNo,"2");
		//Thread.sleep(3000);
	
	}
	
	@Test
	public void testRoadAndField2() throws InterruptedException
	{
		
		driver.get("https://www.rodanandfields.com/ca");
		RoadAndField rf=new RoadAndField(driver);
		rf.moveOnElement2();
		rf.clickAllProduct();
		rf.selectPriceValue();
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void afterExecution()
	{
		driver.close();
	}

}
