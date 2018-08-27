package learn.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArkCyberSolutions {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://arkcybersolutions.com/it-training.html");
		driver.navigate().refresh();
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/nav/ul/li[4]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/nav/ul/li[4]/ul/li[4]/a")).click();
		//driver.close();
		
	}

}
