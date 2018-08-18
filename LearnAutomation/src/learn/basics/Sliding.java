package learn.basics;

import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliding {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1st method
		
		List<WebElement> list=driver.findElements(By.id("iframe"));
		System.out.println(list.size());
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions action=new Actions(driver);
		action.moveToElement(slider).dragAndDropBy(slider, 200, 0).build().perform();
		
		
	}

}
