package com.testcases.dsalgo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pageobject.dsalgo.ActualRegister;
import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.HomePage;
import com.pageobject.dsalgo.Signout;


@Listeners(AllureListener.class)
public class RegisterTest extends BaseClass {

	@Test
	public void Register1() {
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		Getstartedpage gt = new Getstartedpage(driver);

		gt.Register();
	}

	@Test
	public void Register2() {

		HomePage hp = new HomePage(driver);
		hp.registerlink();
	}
	
	
	@Test 
	public void Register3() throws InterruptedException, IOException {
		
		 ActualRegister ar=new ActualRegister(driver);
		  ar.setUserName(username); 
		  ar.setPassword(password);
		  ar.setconfirmPassword(password);
		  ar.clickSubmit(); 
		  Thread.sleep(3000);
		  String x = driver.getPageSource(); 
		  boolean res=driver.getPageSource().contains("New Account Created.");
		
		 
		 if(res==true)
		 { logger.info("test case passed...."); 
		 Assert.assertTrue(true);
		 }
		 else {
			 captureScreen(driver,"Provide correct information");
			 logger.info("test case failed...."); 
		 Assert.assertTrue(false); 
		 }}
	
	@Test
	public void signout1() throws IOException {
		 Signout s1=new Signout(driver);
		 s1.signoutClick();
         boolean out=driver.getPageSource().contains("Logged out successfully");
		 
		 if(out==true)
		 { logger.info("signout1 case passed...."); 
		 Assert.assertTrue(true);
		 }
		 else {
			 
			 captureScreen(driver,"signout successfully");
			 logger.info("signout1 case failed...."); 
		 Assert.assertTrue(false); 
		
	}

	
	}
}