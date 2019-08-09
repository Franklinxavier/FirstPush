import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	
	public static void getTheTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the browser window
		driver.manage().window().maximize();
		//Hit the Browser
		driver.get("https://www.facebook.com/");
		
		//To get the Title
		
		String title = driver.getTitle();
		System.out.println("The current window title is "+title);
	}

	public static void main(String[] args) {
		getTheTitle();

	}

}
