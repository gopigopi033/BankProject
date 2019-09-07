package com.bank.qa.testcases;

import org.testng.annotations.Test;

import com.bank.qa.base.baseactions;
import com.bank.qa.pages.loginpage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class loginpagetest extends baseactions {
  
	public static loginpage log;
    
	@BeforeSuite
  public void setup() {
	  launchbrowser();
	  log=new loginpage();
	    }
  
//	@Test
//	public void Guru99logotest() {
//		log.text();
//	}
	
	@Test
	public void Guru99logotest() {
		boolean fl=log.text();
		Assert.assertTrue(fl);
		System.out.println(fl);
	}
	
	@Test
	public void Logintest() {
		log.login();
	}
	
	
	
  @AfterSuite
  public void closebrowser() {
	  
  }

}
