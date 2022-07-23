package com.pageobject.dsalgo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.dsalgo.BaseClass;

public class QueuePage extends BaseClass {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public QueuePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

@FindBy(xpath="(//div[@class='card-body d-flex flex-column']//a[@class='align-self-end btn btn-lg btn-block btn-primary'])[5]")
WebElement Queue;

@FindBy(xpath ="(//ul//a[@class='list-group-item'])[1]")
WebElement impqueuePython;

@FindBy(xpath="(//li[@class='list-group-item list-group-item-light '])[2]")
WebElement collectionDequeue;

@FindBy(xpath="(//li[@class='list-group-item list-group-item-light '])[3]")
WebElement queueArray;

@FindBy(xpath="(//li[@class='list-group-item list-group-item-light '])[4]")
WebElement collectionOperation;

@FindBy(xpath = "//a[@class='btn btn-info']")
WebElement tryhere;

@FindBy(xpath = "//button")
WebElement clickbtn;

public void ClickQueue()
{
	Queue.click();
}

public void ImplementQueuePython()
{
	impqueuePython.click();
}

public void CollectionDequeue()
{
	collectionDequeue.click();
}

public void QueueArray()
{
	queueArray.click();
}

public void CollectionOperations()
{
	collectionOperation.click();
}

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
public void BacktoQueue()
{
	driver.navigate().back();  
}



}
