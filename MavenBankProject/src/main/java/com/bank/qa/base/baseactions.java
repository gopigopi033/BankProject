package com.bank.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.bank.qa.testutil.WebEventListener;

public class baseactions {
 
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium java\\chrome2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V2/");
		
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.switchTo().alert().dismiss();
	}
}
