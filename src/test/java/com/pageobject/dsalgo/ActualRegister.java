package com.pageobject.dsalgo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActualRegister {
	WebDriver driver;
	
	public ActualRegister(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='id_username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='id_password1']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='id_password2']")
	WebElement password2;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement registerBtn;
	
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void setconfirmPassword(String pwd)
	{
		password2.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		registerBtn.click();
	}	
	

}
