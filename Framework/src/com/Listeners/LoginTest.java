package com.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void navigate() {
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
	}
	
	
	@Test(dataProvider=("credentialspaasing"))
	public void loginWithCredentials(String un,String pw) {
		
		driver.findElement(By.id("login1")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.getTitle());
		
	}
	
	@DataProvider
	public Object credentialspaasing() {
		
		Object[][] data=new Object[2][2];
		data[0][0]="admin";
		data[0][1]="user1";
		data[1][0]="madhusudan405@rediffmail.com";
		data[1][1]="dontgiveup";
		
		return data;
	}
	
}
