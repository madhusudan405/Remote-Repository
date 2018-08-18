package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		/*//method 1
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']/p")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/h1")).getText());
			*/
		//method2
		
		WebElement frame=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		System.out.println(driver.findElement(By.xpath("//*[@id='draggable']/p")).getText());
		WebElement box=driver.findElement(By.xpath("//*[@id='draggable']"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(box, 50, 50).build().perform();
		
		driver.close();

	}

}
