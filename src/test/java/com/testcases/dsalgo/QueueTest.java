package com.testcases.dsalgo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.LoginPage;
import com.pageobject.dsalgo.QueuePage;

public class QueueTest extends BaseClass {
	
	@Test
	public void queuetest() {
		

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
	 
	 QueuePage Qp=new QueuePage(driver);
	 
	 Qp.ClickQueue();
	 Qp.ImplementQueuePython();

	 Qp.scrolldown();
	 Qp.tryhereclick();
	 Qp.EnterKeys11();
	 Qp.clickbutton();
	 Qp.BacktoQueue();
	 Qp.CollectionDequeue();
	 Qp.scrolldown();
	 Qp.tryhereclick();
	 Qp.EnterKeys11();
	 Qp.clickbutton();
	 Qp.BacktoQueue();
	 Qp.QueueArray();
	 Qp.scrolldown();
	 Qp.tryhereclick();
	 Qp.EnterKeys11();
	 Qp.clickbutton();
	 Qp.BacktoQueue();
	 Qp.CollectionOperations();
}
}

