package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.qa.base.baseactions;

public class loginpage extends baseactions {
	
//************* POM Method ******************//	

	@FindBy(xpath="/html/body/div[2]/h2")
	WebElement img;
	
	@FindBy(xpath="//input[contains(@name,'uid')]") // Dynamic or customize xpath (using contains)
	public static WebElement cusid;
	
	@FindBy(name="password")
	public static WebElement pwd;
	
	@FindBy(name="btnLogin")
	public static WebElement logbtn;
	
//-------------------------------------//	
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
//-------------------------------------//	
	public boolean text() {
		  return img.isDisplayed();
	}
	
	public static void login() {
		cusid.sendKeys("mngr229111");
		pwd.sendKeys("pErazAn");
		logbtn.click();
	}
}
