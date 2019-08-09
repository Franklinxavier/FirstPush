	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
public class SendKeyToElem {

	public static void sendValues() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the browser window
		driver.manage().window().maximize();
		//Hit the Browser
		driver.get("https://www.facebook.com/");
		
		//SendKeys To The Input Field
		
		 WebElement emailField = driver.findElement(By.id("email"));
		 emailField.sendKeys("Letmelogindude@gmail.com");
		 
		
	}//Method Ends Here

	public static void main(String[] args) {
		sendValues();
		
	}//Main Method Ends Here

	}//class Ends Here



