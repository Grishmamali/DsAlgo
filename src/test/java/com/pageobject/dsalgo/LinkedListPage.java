package com.pageobject.dsalgo;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testcases.dsalgo.BaseClass;



public class LinkedListPage extends BaseClass{

	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public LinkedListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="(//div[@class='card-body d-flex flex-column'])[3]//a[@class='align-self-end btn btn-lg btn-block btn-primary']")
   WebElement linkedlist;
	
   @FindBy(xpath="(//a[@class='list-group-item' ])[1]")
   WebElement introduction;
   
 @FindBy(xpath = "//a[@class='btn btn-info']")
 WebElement tryhere;
 
 @FindBy(xpath ="//form[@id='answer_form']/div/div/div/textarea")
 WebElement entertext;
 
 @FindBy(xpath = "//button")
 WebElement clickbtn;
 
 @FindBy(xpath = "(//li[@class='list-group-item list-group-item-light '])[2]")
 WebElement creatinglinkedlist;
 
 
 @FindBy(xpath = "(//li[@class='list-group-item list-group-item-light '])[3]")
 WebElement typeoflinkedlist;
 
 @FindBy(xpath = "(//li[@class='list-group-item list-group-item-light '])[4]")
 WebElement implimentlinkedlist;
 
 @FindBy(xpath="(//li[@class='list-group-item list-group-item-light '])[5]")
 WebElement traverse;
 
 
 
 public void clicklinkedlist() {
	 linkedlist.click();
 }
 
 public void clickIntroduction() {
	 
	 introduction.click();
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

public void BacktolinkedList()
{
	driver.navigate().back();  
}

public  void creatinglinkedlist1() {
	creatinglinkedlist.click();
	
}

public void TypeOfLinkedList() {
	typeoflinkedlist.click();
}

public void Implementlinkedlist() {
	implimentlinkedlist.click();
}
public void TraversaleLink() {
	traverse.click();
	
}
}
