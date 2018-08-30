package com.ddf;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import My_Library.MyCodeForScreenShot;

public class RediffMailLogin {
	WebDriver driver=new FirefoxDriver();
	
	@Test(priority=1,dataProvider=("credentials"))
	public void loginToRediff(String username,String password) {
		
		driver.navigate().to("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//System.out.println(driver.getTitle());
		Assert.assertEquals("Rediffmail", driver.getTitle());
		//System.out.println("Login Successfully");
		
				
	}
	
	@Test(priority=2,dependsOnMethods="loginToRediff")
	public void logout() {
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
	@DataProvider
	public Object[][] credentials(){
		
		Object[][] data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="demo123";
		data[1][0]="madhusudan405@rediffmail.com";
		data[1][1]="dontgiveup";
		data[2][0]="admin";
		data[2][1]="demo12345";
		
		return data;
		
	}

}
