package com.testcases.dsalgo;

import org.testng.annotations.Test;

import com.pageobject.dsalgo.ActualRegister;

public class ActualRegisterTest extends BaseClass{

	
	@Test
	public void actualregistertest() {
		
		ActualRegister ar=new ActualRegister(driver);
		driver.manage().window().maximize();
		ar.setUserName(username);
		ar.setPassword(password);
		ar.setconfirmPassword(password);
		ar.clickSubmit();
	}
}
