import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableOrNot {

	public static void enable() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//To maximize the browser window
		driver.manage().window().maximize();
		
		WebElement logInBtn = driver.findElement(By.id("loginbutton"));
		boolean res = logInBtn.isEnabled();
		System.out.println("Is Element enabled "+res);
	}
	public static void main(String[] args) {
		enable();
	}//Method Ends Here
}//Class Ends Here
