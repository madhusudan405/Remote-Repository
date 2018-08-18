package learn.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import useful_library.Mycode_for_SceenShot;

public class AdvancedXpath {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		Mycode_for_SceenShot.getScreenShot(driver, "w3login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[text()=\"Learn Bootstrap 4\"]")).click();
		driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[text()=\"Learn XML DOM\"]")).click();
		driver.close();
		

	}

}
