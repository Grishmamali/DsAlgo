package com.pageobject.dsalgo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Signout {
	
	WebDriver driver;
	public Signout(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains( text(),'Sign out')]")
	WebElement signoutbtn;
	
	@Test
	public void signoutClick() {
		signoutbtn.click();
	}

}
