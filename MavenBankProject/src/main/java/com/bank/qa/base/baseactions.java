package com.bank.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseactions {
	public static WebDriver c;
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome\\chromedriver.exe");
		c=new ChromeDriver();
		c.get("http://demo.guru99.com/V2/");
		c.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		c.manage().window().maximize();
	}

}
