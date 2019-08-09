import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

public static void locatElem() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//To maxmize the browser window
	driver.manage().window().maximize();
	//Hit the Browser
	driver.get("https://www.facebook.com/");
	
	//Get or Locate input Element
	
	String tagName = driver.findElement(By.id("email")).getTagName();
	System.out.println("Located Element is "+tagName+" tag");
	
}//Method Ends Here

public static void main(String[] args) {
	locatElem();
}//Main Method Ends Here

}//class Ends Here

