package com.calidad.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{

		WebDriver driver;
		
		public LoginPage(WebDriver Driver)
		{
			this.driver=Driver;
			
			PageFactory.initElements(driver,this);
		}
		
	@FindBy(xpath="//input[@id='user-name']") WebElement uname;
	
	@FindBy(xpath="//input[@id='password']") WebElement pwd;
	
	@FindBy(xpath="//input[@id='login-button']") WebElement loginClick;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") WebElement addtoCart;
	@FindBy(xpath="//a[@class='shopping_cart_link']") WebElement cart;
	@FindBy(xpath="//button[@id='checkout']") WebElement checkout;
	@FindBy(id="first-name") WebElement firstname;
	@FindBy(id="last-name") WebElement lastname;
	@FindBy(id="postal-code") WebElement postlaCode;
	
	
	@FindBy(xpath="//input[@id='continue']") WebElement last_continue;
	@FindBy(xpath="//button[@id='finish']") WebElement finish;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") WebElement menu;
	@FindBy(xpath="//a[@id='logout_sidebar_link']") WebElement logout;
	
	public void loginPortal(String username, String pass) {
		
		uname.sendKeys(username);
		pwd.sendKeys(pass);
		loginClick.click();
	}
	
	public void addtoCart_AndCheckout() {
		
		addtoCart.click();
        cart.click();
        checkout.click();
		
	}
	
	public void addCredentials(String fname,String lname, Integer nmr) {
		
			firstname.sendKeys(fname);
			lastname.sendKeys(lname);
			postlaCode.sendKeys(nmr);
			
	}
	
	public void finalStep() {
		
		last_continue.click();
		finish.click();
		menu.click();
		logout.click();
	}
	
}
