package com.testcases.dsalgo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.LoginPage;
import com.pageobject.dsalgo.StackPage;

public class StackTest extends BaseClass{

	@Test
	public void Stack_Test()
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
		 
		 if(res==true)
		 { logger.info("login case passed...."); 
		 Assert.assertTrue(true);
		 }
		 else { logger.info("login case failed...."); 
		 Assert.assertTrue(false); 
		 }
		 
		 StackPage SP=new StackPage(driver);
		 SP.Stackclick();
		 SP.OperationInStackclick();
		 SP.scrolldown();
		 SP.tryhereclick();
		 SP.EnterKeys11();
		 SP.clickbutton();
		 SP.BacktoStack();
		 SP.scrollup();
		 SP.ImplementationStack();
		
		 SP.tryhereclick();
		 SP.EnterKeys11();
		 SP.clickbutton();
		 SP.BacktoStack();
		 
		 SP.ApplicationStack();
		 SP.scrolldown();
		 SP.tryhereclick();
		 SP.EnterKeys11();
		 SP.clickbutton();
		 SP.BacktoStack();

}
}
