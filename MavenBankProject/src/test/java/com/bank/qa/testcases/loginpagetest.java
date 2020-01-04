package com.bank.qa.testcases;

import org.testng.annotations.Test;

import com.bank.qa.base.baseactions;
import com.bank.qa.pages.loginpage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class loginpagetest extends baseactions {

	public static loginpage log;

	@BeforeTest
	public void setup() {
		launchbrowser();
		log = new loginpage();
	}

	@Test(priority = 1)
	public void Guru99logotest() {
		boolean fl = log.text();
		Assert.assertTrue(fl);
		System.out.println(fl);
	}

	@Test(priority = 2)
	public void Logintest() {
		log.login();
	}

	@AfterTest
	public void closebrowser() {
		driver.quit();
	}

}
