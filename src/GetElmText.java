import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElmText {

	public static void elmText() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the browser window
		driver.manage().window().maximize();
		//Hit the Browser
		driver.get("https://www.facebook.com/");
		
		//Get The Text Of WebElement
		 String text = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("The Element Text is----->"+text);
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		elmText();

	}

}
