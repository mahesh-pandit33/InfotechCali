package com.calidad.testcases;

import org.testng.annotations.Test;

import com.calidad.pages.BaseTest;
import com.calidad.pages.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage lp=new LoginPage(driver);
	
	
	@Test(priority=1)
	void verifyLogin() {
	LoginPage lp=new LoginPage(driver);
	String username="standard_user";
	String password="secret_sauce";
      lp.loginPortal(username, password);
	}
	
	
	@Test(priority=2)
	void addtoCart_AndGo_toCart() {
		LoginPage lp=new LoginPage(driver);
		lp.addtoCart_AndCheckout();
	}
	
	@Test(priority=3)
	void addyourDetails() {
		lp.addCredentials(mahesh,pandit,380059);
		
	}
	
	void  finalSubmission() {
		
		lp.finalStep();
	}
	
	
}
