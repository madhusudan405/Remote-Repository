package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dst).build().perform();
		//System.out.println(list.size());

	}

}
