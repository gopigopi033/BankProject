package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.baseactions;

public class homepage extends baseactions {

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
	public static WebElement newcustomer;

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[3]/a")
	public static WebElement editcustomer;

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[4]/a")
	public static WebElement deletecustomer;

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
	public static WebElement newaccount;

	// -------------------------------------//
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	// -------------------------------------//

	public static void newcustomermenu() {
		newcustomer.click();
	}

	public static void editcustomermenu() {
		editcustomer.click();
	}

	public static void deletecustomermenu() {
		deletecustomer.click();
	}

	public static void newaccountmenu() {
		newaccount.click();
	}

}
