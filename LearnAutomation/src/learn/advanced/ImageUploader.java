package learn.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageUploader {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://tinypic.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='the_file']")).sendKeys("C:\\Users\\India-HCL-ME\\Desktop\\xpath.txt");
		
		//AutoIT
		driver.findElement(By.xpath("//*[@id='the_file']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\India-HCL-ME\\Desktop\\vmAutoit.exe");
		
		

	}

}
