package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> check=driver.findElements(By.xpath("//div[@class='display'][1]/input[@type='checkbox']"));
		System.out.println(check.size());
		for(WebElement e:check) {
			if(e.getAttribute("value").equals("baseball")||e.getAttribute("value").equals("football")) {
				e.click();
			}
		}
		driver.close();
		
		
		
	}

}
