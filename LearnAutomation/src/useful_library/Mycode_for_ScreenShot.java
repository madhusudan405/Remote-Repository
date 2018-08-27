package useful_library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Mycode_for_ScreenShot {
	
	
	
	public static void getScreenShot(WebDriver driver,String filename) {
		
		
		try {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./ScreenShot/"+filename+".png"));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} 
		
		//here insted of try catch i can add throws declaration also
	}

}
