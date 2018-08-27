package learn.advanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerNew {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yatra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id='BE_flight_arrival_city']")).sendKeys("New Delhi");
		String checkIn_Date="2-August'18";
		String[] split=checkIn_Date.split("-");
		String checkIn_Day=split[0];
		String checkIn_Month_Year=split[1];
		System.out.println(checkIn_Day);
		System.out.println(checkIn_Month_Year);
		
		driver.findElement(By.xpath("//li[@class='w170 datepicker']/section/i")).click();
	}

}
