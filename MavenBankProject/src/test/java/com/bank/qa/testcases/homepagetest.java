package com.bank.qa.testcases;

import org.testng.annotations.Test;

import com.bank.qa.base.baseactions;
import com.bank.qa.pages.homepage;
import com.bank.qa.pages.loginpage;
import com.bank.qa.testutil.TestUtil;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class homepagetest extends baseactions {

	public static loginpage log;
	public static homepage home;
	public static TestUtil test;

	@BeforeMethod
	public void beforeMethod() {
		launchbrowser();
		log = new loginpage();
		home = new homepage();
		test = new TestUtil();
	}

	@Test(priority=1)
	public void verifynewcustomermenu() {
		log.login();
		home.newcustomermenu();
	}

	@Test(priority=2)
	public void verifyeditcustomermenu() {
		log.login();
		home.editcustomermenu();
	}

	@Test(priority=3)
	public void verifydeletecustomermenu() {
		log.login();
		home.deletecustomermenu();
	}

	@Test(priority=4)
	public void verifynewaccountmenu() {
		log.login();
		home.newaccountmenu();
	}

	@AfterMethod
	public void afterMethod() {
	}

}
