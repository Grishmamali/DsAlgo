package com.pageobject.dsalgo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.dsalgo.BaseClass;


public class LoginPage extends BaseClass  {
	
WebDriver driver;
	

	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signinlink;
	
    @FindBy(xpath = "//input[@id='id_username']")
    WebElement userName;
    
    @FindBy(xpath = "//input[@id='id_password']")
    WebElement pwd1;
    
    @FindBy(xpath = "//input[@value='Login']")
    WebElement logbtn;
    
    
    
	public void login()
 {
	 signinlink.click();
 }
	
	public void registeruserName(String username) {
		userName.sendKeys(username);
		
	}
	
	public void registerpassword(String password) {
		
	pwd1.sendKeys(password);
		
		
	}
	
	public void loginclick()
	{
		logbtn.click();
	}
	
	
}
