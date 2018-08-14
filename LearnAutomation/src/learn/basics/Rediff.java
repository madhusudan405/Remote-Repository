package learn.basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import useful_library.Mycode_for_SceenShot;

public class Rediff {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.rediff.com/");
		Mycode_for_SceenShot.getScreenShot(driver, "login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
		driver.findElement(By.id("login1")).sendKeys("madhusudan405@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("dontgiveup");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
		Mycode_for_SceenShot.getScreenShot(driver, "inbox");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div/div[2]/a[2]")).click();
		Mycode_for_SceenShot.getScreenShot(driver, "logout");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
	}

}
