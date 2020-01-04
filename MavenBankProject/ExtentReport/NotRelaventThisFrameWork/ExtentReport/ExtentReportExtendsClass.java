package ExtentReport;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtentReportExtendsClass extends ExtentReportMain {

	@Test
	public void FreeCrmTitleTest(){
		extentTest1 = extent1.startTest("GoogleTitleTest");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google");
		}
	
	@Test
	public void FreemCRMLogoTest(){
		extentTest1 = extent1.startTest("GoogleLogoTest");
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@Test
	public void TextisDiplayorNot(){
		extentTest1 = extent1.startTest("GoogleTextTest");
		boolean b = driver.findElement(By.xpath("//div[@id='SIvCob']")).isDisplayed();
		Assert.assertFalse(b);
		}
}