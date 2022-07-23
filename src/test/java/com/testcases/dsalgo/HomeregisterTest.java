package com.testcases.dsalgo;

import org.testng.annotations.Test;

import com.pageobject.dsalgo.HomePage;

public class HomeregisterTest extends BaseClass {
	
	@Test
	public void homeregistertest() throws InterruptedException {
		 
		
		HomePage hp=new HomePage(driver);
		hp.registerlink();
	}

}
