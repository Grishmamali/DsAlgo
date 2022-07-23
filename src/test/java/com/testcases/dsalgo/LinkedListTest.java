package com.testcases.dsalgo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.LinkedListPage;
import com.pageobject.dsalgo.LoginPage;

public class LinkedListTest extends BaseClass {
	
	
	
	@Test
	public void linkedlistTest()
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
		 
		
		LinkedListPage LL=new LinkedListPage(driver);
		
		LL.clicklinkedlist();
		LL.clickIntroduction();
		LL.scrolldown();
		LL.tryhereclick();
		LL.EnterKeys11();
		LL.clickbutton();
		LL.BacktolinkedList();
		LL.creatinglinkedlist1();
		LL.scrolldown();
		LL.tryhereclick();
		LL.EnterKeys11();
		LL.clickbutton();
		LL.BacktolinkedList();
		LL.TypeOfLinkedList();
		LL.scrolldown();
		LL.tryhereclick();
		LL.EnterKeys11();
		LL.clickbutton();
		LL.BacktolinkedList();
		LL.Implementlinkedlist();
		LL.scrolldown();
		LL.tryhereclick();
		LL.EnterKeys11();
		LL.clickbutton();
		LL.BacktolinkedList();
		LL.TraversaleLink();
		LL.scrolldown();
		LL.tryhereclick();
		LL.EnterKeys11();
		LL.clickbutton();
		LL.BacktolinkedList();

		
	}

}
