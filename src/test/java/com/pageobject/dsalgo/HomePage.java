package com.pageobject.dsalgo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.dsalgo.BaseClass;

public class HomePage extends BaseClass {
	WebDriver driver;


	public HomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//a[contains(text(),' Register ')]")
	WebElement clickregisterlink;

	public void registerlink() {
		clickregisterlink.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}





	}


