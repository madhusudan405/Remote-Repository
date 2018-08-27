package learn.basics;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Password {
	static String password="ZG9udGdpdmV1cA==";

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[contains(@title,'Sign in')]")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("madhusudan405@rediffmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(getdecodedpassword());
		driver.findElement(By.xpath("//div[@class='floatL']/input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		driver.close();

	}
	
	public static String getdecodedpassword() {
		return new String (Base64.getDecoder().decode(password.getBytes()));
	}

}
