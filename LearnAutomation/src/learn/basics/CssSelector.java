package learn.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Mycode_for_SceenShot.getScreenShot(driver, "redifflogin");
		driver.findElement(By.xpath("//*[@id='signin_info']/a[starts-with(@title,'Already')]")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys("madhusudan405@rediffmail.com");
		
		

	}

}
