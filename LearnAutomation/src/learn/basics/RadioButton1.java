package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/welcomeLink");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector(".main_button_typ_002")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@name='cpvLocation']"));
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).getAttribute("value").equals("13")) {
				list.get(i).click();
				
			}
			System.out.println(list.get(i).getAttribute("value"));
			System.out.println(list.get(i).isSelected());
			
		}
		
		//System.out.println(list.size());
		//driver.close();

	}

}
