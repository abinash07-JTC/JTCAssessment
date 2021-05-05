package com.jtc.qa.testCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.jtc.qa.base.TestBase;
import com.jtc.qa.search.Search;

public class SearchPageTest extends TestBase {
	
	Search search; 
	
	
	 public SearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		 search=new Search();
	}
	
	
	
	@Test()
	public void SearchData()  {
		search.Searching(prop.getProperty("data"));
		String exce=prop.getProperty("excepted");
		String titel=search.validatePage();
		Assert.assertEquals(titel, exce);
		
		driver.navigate().back();
		
		String titel1=search.validateSearch();
		Assert.assertEquals(titel1, "Google");
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}


