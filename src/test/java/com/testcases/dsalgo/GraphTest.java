package com.testcases.dsalgo;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.GraphPage;
import com.pageobject.dsalgo.LoginPage;


public class GraphTest extends BaseClass{
	@Test
	public void graph() {
		

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
	 
	 GraphPage Gp=new GraphPage(driver);
	 
       Gp.Clickgraph();
       Gp.graph1click();
	  Gp.scrolldown();
	 Gp.tryhereclick();
	 Gp.EnterKeys11();
	 Gp.clickbutton();
	 Gp.BacktoGraph();
	 
	Gp.graphpp1();
	Gp.scrolldown();
	Gp.tryhereclick();
	Gp.EnterKeys11();
	Gp.clickbutton();
	 Gp.BacktoGraph();
	
}

}
