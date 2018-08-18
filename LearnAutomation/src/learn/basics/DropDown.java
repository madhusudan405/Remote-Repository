package learn.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To select date
		WebElement ele=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		List<WebElement> date=ele.findElements(By.tagName("option"));
		System.out.println(date.size());
		
		for(int i=0;i<date.size();i++) {
			//System.out.println(date.get(i).getText());
			if(date.get(i).getAttribute("value").equals("21")) {
				date.get(i).click();
				break;
			}
		}
		
		//To select month
		
		WebElement elem=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		List<WebElement> month=elem.findElements(By.tagName("option"));
		//System.out.println(month.size());
		for(int j=0;j<month.size();j++) {
			//System.out.println(month.get(j).getAttribute("value"));
			if(month.get(j).getAttribute("value").equals("08")) {
				month.get(j).click();
				break;
			}
		}
		//To select year
		
		WebElement eley=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		List<WebElement> year=eley.findElements(By.tagName("option"));
		System.out.println("--------------");
		System.out.println(year.size());
		for(int k=0;k<year.size();k++) {
			
			if(year.get(k).getAttribute("value").equals("1995")) {
				year.get(k).click();
				break;
				
			}
			//System.out.println(year.get(k).getAttribute("value"));
		}
		

	}

}
