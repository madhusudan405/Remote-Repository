package learn.advanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='global-nav-flights']")).click();
		driver.findElement(By.xpath("//input[@class=\"query origWithLabel\"]")).clear();
		driver.findElement(By.xpath("//input[@class=\"query origWithLabel\"]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id='taplc_trip_search_home_flights_0']/div[2]/div/span/div[1]/div[2]/div[1]/div/div[2]/input[2]")).sendKeys("New Delhi");
		
		String date="2-Oct 2018";
		String[] splitter=date.split("-");
		String checkin_day=splitter[0];
		String month_Year=splitter[1];
		System.out.println(checkin_day);
		System.out.println(month_Year);
		driver.findElement(By.xpath("//div[@id='rt_ui_picker']/span[1]")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//span[@class=\"rsdc-month-title\"]"));
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++)
		{
		System.out.println(ele.get(i).getText());	
		
		//selecting month and year
		if(ele.get(i).getText().equals(month_Year)) {
			
			//selecting the date
			List<WebElement> dateele=driver.findElements(By.xpath("//div[@class='rsdc-months']/span[@class='rsdc-month']["+(i+1)+"]/span"));
			System.out.println("-------------------------------");
			System.out.println(dateele.size());
			for(WebElement s:dateele) {
				//System.out.println(s.getText());
				if(s.getText().equals(checkin_day)) {
					s.click();
					break;
				}
				
			}
			
			}
			
					
		}
		
		driver.findElement(By.xpath("//div[@class='ui_column submit_wrap']/button[contains(@class,'form_submit searchBtn')]")).click();
	}

}
