package com.bank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.baseactions;

public class loginpage extends baseactions {
	
//************* 1. POM Method ******************//	

	@FindBy(xpath="/html/body/div[2]/h2")
	WebElement img;
	
	@FindBy(name="uid")
	public static WebElement cusid;
	
	@FindBy(name="password")
	public static WebElement pwd;
	
	@FindBy(name="btnLogin")
	public static WebElement logbtn;
//-------------------------------------//	
	public loginpage() {
		PageFactory.initElements(c, this);
	}
//-------------------------------------//	
	public boolean text() {
		  return img.isDisplayed();
	}
	
	public static void login() {
		cusid.sendKeys("mngr218308");
		pwd.sendKeys("atuvEbE");
		logbtn.click();
	}
	
	
//***************** 2. Normal Method *********************//

//	public static void text() {
//		  boolean isdisplay=c.findElement(By.xpath("/html/body/div[2]/h2")).isDisplayed();
//		  System.out.println(isdisplay);
//		  	}

//	public login() {
//		c.findElement(By.name("uid")).sendKeys("mngr218308");
//		c.findElement(By.name("password")).sendKeys("atuvEbE");
//		c.findElement(By.name("btnLogin")).click();
//					}
	

}
