package com.pageobject.dsalgo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.dsalgo.BaseClass;

public class ArrayPage extends BaseClass {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public ArrayPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="(//div[@class='card-body d-flex flex-column']//a[@class='align-self-end btn btn-lg btn-block btn-primary'])[2]")
	WebElement Array1;

	@FindBy(xpath ="(//ul//a[@class='list-group-item'])[1]")
	WebElement arrayinPython;

	@FindBy(xpath ="(//li[@class='list-group-item list-group-item-light '])[2]")
	WebElement arrayusinglist;

	@FindBy(xpath ="(//li[@class='list-group-item list-group-item-light '])[3]")
	WebElement basicoperationlist;

	@FindBy(xpath ="(//li[@class='list-group-item list-group-item-light '])[4]")
	WebElement applicationofArray;

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryhere;

	@FindBy(xpath = "//button")
	WebElement clickbtn;

	public void scrolldown() {
		js.executeScript("arguments[0].scrollIntoView();", tryhere);
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
	public void BacktoArray()
	{
		driver.navigate().back();  
	}

public void Array1Click()
{
	Array1.click();
}

public void arrayusinglist()
{
	arrayusinglist.click();
}

public void Arrayinpython()
{
	arrayinPython.click();
}

public void BasicoperationList()
{
	basicoperationlist.click();
}

public void Appilcationinarray()
{
   applicationofArray.click();
}
}
