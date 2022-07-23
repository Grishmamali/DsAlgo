package com.pageobject.dsalgo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.dsalgo.BaseClass;

public class StackPage extends BaseClass{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public  StackPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="(//div[@class='card-body d-flex flex-column'])[4]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")
	   WebElement Stack;
	 
	 @FindBy(xpath="(//a[@class='list-group-item' ])[1]")
	   WebElement Operationinstack;
	 
	 
	 @FindBy(xpath="//li[2]/a")
	   WebElement Implimentstack;
	 
	 @FindBy(xpath="//li[3]/a")
	   WebElement Applicationstack;
	 
	 @FindBy(xpath = "//a[@class='btn btn-info']")
	 WebElement tryhere;
	 
	 @FindBy(xpath ="//form[@id='answer_form']/div/div/div/textarea")
	 WebElement entertext;
	
	 @FindBy(xpath = "//button")
	 WebElement clickbtn;
	 
	 public void Stackclick()
	 {
		 Stack.click();
	 }
	 
	 public void OperationInStackclick() {
		 Operationinstack.click();
		
	}
	 
	 public void ImplementationStack() {
       Implimentstack.click();
		
	}
	 public void scrolldown() {
		  js.executeScript("arguments[0].scrollIntoView();", tryhere);
	 }
	 
	 public void scrollup() {
		 js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
	}

	 public void tryhereclick()
	 { 
		 tryhere.click();
		 
	 }
	 public void EnterKeys11()
	 {  	 
		 String js_call = "window.editor.setValue(\"print 10\"); ";

		 JavascriptExecutor js = (JavascriptExecutor)driver;

		 js.executeScript(js_call);
		 System.out.println("Text Entered");

		
	 }
	 
	public void clickbutton()
	{
		clickbtn.click();
	}

	public void BacktoStack()
	{
		driver.navigate().back();  
	}
public void ApplicationStack() {
	Applicationstack.click();
	
}

}
