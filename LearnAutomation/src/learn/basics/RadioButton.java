package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://materializecss.com/radio-buttons.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*List<WebElement> list=driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
			
			if(e.getAttribute("value").equals("Cheese")) {
				e.click();
			}
		}
		System.out.println("------------------------------------------");
		for(WebElement e:list) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
		}
		*/
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@name=\"group1\"]"));
		System.out.println(list.size());
		for(WebElement e:list) {
			System.out.println(e.isSelected());
			
			
		}
		
		driver.close();

	}

}
