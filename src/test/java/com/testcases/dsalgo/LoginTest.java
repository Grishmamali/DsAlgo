package com.testcases.dsalgo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.LoginPage;

public class LoginTest extends BaseClass {
	 
	@Test
	public void Login() throws IOException
	{
		 
		 driver.get(baseURL);
		  Getstartedpage gt = new Getstartedpage(driver);
          gt.Register();
          LoginPage lp=new  LoginPage(driver);
          lp.login();
          lp.registeruserName(username);
          lp.registerpassword(password);
          lp.loginclick();
          
          
         boolean res=driver.getPageSource().contains("You are logged in");
		// String res=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
		 if(res==true)
		 { logger.info("login case passed...."); 
		 Assert.assertTrue(true);
		 }
		 else { 
			 captureScreen(driver,"Provide correct Information");
			 logger.info("login case failed...."); 
		 Assert.assertTrue(false); 
		 }
		 
	}
}

