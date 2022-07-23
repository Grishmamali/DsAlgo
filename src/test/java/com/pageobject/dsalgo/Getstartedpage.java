package com.pageobject.dsalgo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.dsalgo.BaseClass;

public class Getstartedpage extends BaseClass {
	WebDriver driver;
	
	
	public Getstartedpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
 @FindBy(xpath = "//button[@class='btn']")
 WebElement getstart;
 
 
 public void Register() {
	  getstart.click();
	 
	 
 }
 
 
}
