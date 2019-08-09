import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void screenShot() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskTuesday\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		File des=new File("C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\ScreenShots\\sceenshotimg.png");
		TakesScreenshot ts=(TakesScreenshot)driver;//TypeCastingxczz
		File scrImg = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrImg,des);
	}//Method Ends Here
	public static void main(String[] args) throws IOException {
		screenShot();
		
	}//Main Method Ends Here
	
}//Class Ends Here
