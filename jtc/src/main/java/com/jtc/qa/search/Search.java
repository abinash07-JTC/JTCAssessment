package com.jtc.qa.search;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.jtc.qa.base.TestBase;

public class Search extends TestBase {

	@FindBy(name="q")
	WebElement q;
	
	@FindBy(name="btnK")
	WebElement btnk;
	
	public Search() {
		PageFactory.initElements(driver , this);
	}
	
	//action of the page object 
	public String validateSearch() {
		return driver.getTitle();
		
	}
	
	public void Searching(String data)  {
		q.sendKeys(data);
		btnk.click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
			
		 
	 //Traversing through the list and printing its text along with link address
		 for(WebElement link:links){
			 String compare=link.getText();
		 if(data.equalsIgnoreCase(compare)) {
			 System.out.println("you are in relevent page");
		 }
		 }
		

	}
		
		
		
		
	
	public String validatePage() {
		return driver.getTitle();
	}
	
}