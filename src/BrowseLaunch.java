import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseLaunch {

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maxmize the browser window
		driver.manage().window().maximize();
		//Hit the Browser
		driver.get("https://www.facebook.com/");
	}//Method Ends Here
	
	public static void main(String[] args) {
		openBrowser();
	}//Main Method Ends Here
	
	
}//class Ends Here
