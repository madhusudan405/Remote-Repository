package learn.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArkCyberSolutions {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://arkcybersolutions.com/it-training.html");
		driver.navigate().refresh();
		driver.close();
		
	}

}
