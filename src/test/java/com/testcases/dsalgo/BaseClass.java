package com.testcases.dsalgo;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.pageobject.dsalgo.ActualRegister;
import com.pageobject.dsalgo.Getstartedpage;
import com.pageobject.dsalgo.HomePage;
import com.utilities.dsalgo.Readconfig;

@Listeners(AllureListener.class)
public class BaseClass {

	Readconfig readconfig=new Readconfig();

	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();

	public static WebDriver driver;
	public static Getstartedpage gt;
	public static HomePage hp;
	public static ActualRegister ar;
	public static Logger logger;

	@Parameters("browser")

	@BeforeClass
	public void setup(String browser) {

		try {
			logger = Logger.getLogger("DsAlgo");
			PropertyConfigurator.configure("Log4j.properties");

			if(browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
				driver=new ChromeDriver();
			}
			else if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
				driver = new FirefoxDriver();
			}
			logger.info("********************welcome*********************");

			driver.get(baseURL);
			driver.manage().window().maximize();
		} catch (Exception e) {
			logger.error("Error in Test:",e);
			throw e;
		}


	}







	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
