package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W3schools {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.id("srchword")).sendKeys("learning");
		//driver.findElement(By.linkText("Shopping")).click();
		//driver.findElement(By.linkText("cookie and privacy policy")).click();
		//driver.findElement(By.partialLinkText("privacy policy")).click();
		/*List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Learn PHP")) {
				list.get(i).click();
				break;
			}
			
		}*/
		
		List<WebElement> list=driver.findElements(By.className("w3-button"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Learn JSON")) {
				list.get(i).click();
				break;
			}
		}
		driver.close();
		
		
	}

}
