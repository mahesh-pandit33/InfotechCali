package com.calidad.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	WebDriver driver;
	public static WebDriver startApp(WebDriver driver,String browser,String url) {
		
		if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");	
			driver=new EdgeDriver();
		}
		
		else {
			
			System.out.println("We don't support Any Browser");
		}
		
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
		
	}
	

}
