package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		WebElement frame=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		WebElement resize=driver.findElement(By.xpath("//*[@id='resizable']/div[contains(@class,'ui-resizable-se')]"));
		Actions action=new Actions(driver);
		action.moveToElement(resize).dragAndDropBy(resize, 100, 50).build().perform();
		driver.close();
		
		

	}

}
