package learn.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import useful_library.Mycode_for_ScreenShot;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.javascriptkit.com/javatutors/event2.shtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Mycode_for_ScreenShot.getScreenShot(driver, "jsexecutor_login");
		
		
		//driver.findElement(By.xpath("//*[@id='contentcolumn']/div[1]/table/tbody/tr/td[2]/form/input")).click();
		
		//((JavascriptExecutor)driver).executeScript("inform()");
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('fd0')[0].click()");
		//Mycode_for_ScreenShot.getScreenShot(driver, "JsExecutor_output");
		
		//driver.close();

	}

}
