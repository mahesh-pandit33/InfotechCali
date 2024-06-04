package com.calidad.pages;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.calidad.utility.BrowserFactory;
import com.calidad.utility.ConfigDataProvider;

public class BaseTest {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
		config=new ConfigDataProvider();
		
	}
	
	//--------------
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
	}
	
 @AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
 
 public void captureScreenShot(WebDriver driver,String testName) throws IOException
 {
	
	 TakesScreenshot screenshot= ((TakesScreenshot)driver);
	 
	 // Step 2 :call getScreenshotAs method to capture image file
	 
	 File src= screenshot.getScreenshotAs(OutputType.FILE);
	 File srcpath=new File("."+"//Screenshots//"+ testName + ".png");
	 
	 // Step 3 : copy image file to destination 
	 FileUtils.copyFile(src, srcpath);
	 
 }

}