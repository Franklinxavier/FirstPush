import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void getTheurl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the browser window
		driver.manage().window().maximize();
		//Hit the Browser
		driver.get("https://www.facebook.com/");
		
		//Get The Current URL of The Window
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The URL of Current Window ----> "+currentUrl);
	}//Method Ends Here
	public static void main(String[] args) {
		getTheurl();
	}
}
