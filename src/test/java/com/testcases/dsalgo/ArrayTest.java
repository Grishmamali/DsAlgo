package com.testcases.dsalgo;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pageobject.dsalgo.ArrayPage;
import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.LoginPage;


public class ArrayTest extends BaseClass {
	
	@Test
	public void arrayTest() {
		

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
	 
	 ArrayPage AP=new ArrayPage(driver);
	 
	 AP.Array1Click();
	 AP.Arrayinpython();;
     AP.scrolldown();
	 AP.tryhereclick();
	 AP.EnterKeys11();
	 AP.clickbutton();
	 AP.BacktoArray();
	 AP.arrayusinglist();
	 AP.scrolldown();
	 AP.tryhereclick();
	 AP.EnterKeys11();
	 AP.clickbutton();
	 AP.BacktoArray();
	 AP.BasicoperationList();
	 AP.scrolldown();
	 AP.tryhereclick();
	 AP.EnterKeys11();
	 AP.clickbutton();
	 AP.BacktoArray();
	 AP.Appilcationinarray();
	 AP.scrolldown();
	 AP.tryhereclick();
	 AP.EnterKeys11();
	 AP.clickbutton();
	 AP.BacktoArray();
}
}




