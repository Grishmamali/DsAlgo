package com.testcases.dsalgo;
import com.pageobject.dsalgo.Getstartedpage;
import com.utilities.dsalgo.XLUtils;
import com.pageobject.dsalgo.LoginPage;
import com.pageobject.dsalgo.Signout;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class LoginTestDDT extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException, IOException
	{
		
		 driver.get(baseURL);
		  Getstartedpage gt = new Getstartedpage(driver);
         gt.Register();
         LoginPage lp=new  LoginPage(driver);
         lp.login();
         lp.registeruserName(user);
         lp.registerpassword(pwd);
         lp.loginclick();
         Signout so=new Signout(driver);
		
		Thread.sleep(3000);
		
		 boolean res=driver.getPageSource().contains("You are logged in");
			// String res=driver.findElement(By.xpath("//div[@class='alert alert-primary']")).getText();
			 if(res==true)
			 { logger.info("login case passed...."); 
			 Assert.assertTrue(true);
			 so.signoutClick();
			 }
			 else { 
				 captureScreen(driver,"Provide correct information");
				 logger.info("login case failed...."); 
			 Assert.assertTrue(false); 
			 }
			 
	}
	
	
	
		
		
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/testdata/xls/LoginData.xlsx";
	
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	
}