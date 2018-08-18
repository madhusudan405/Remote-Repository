package learn.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//a[@id='gb_70']")).click();
		//driver.findElement(By.xpath("//a[starts-with(@id,'gb_70')")).click();
		driver.findElement(By.id("identifierId")).sendKeys("immadhusudan.n@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		/*List<WebElement> list=driver.findElements(By.tagName("Div"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}*/
		
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("sudan@Ait123");
		//driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
		driver.close();

	}

}
