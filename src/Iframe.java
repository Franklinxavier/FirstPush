import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void frameI() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/iframe-practice-page/");
	//To maximize the browser window
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	//Javascript for scrolling the window
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	Thread.sleep(1000);
	WebElement frame1 = driver.findElement(By.id("IF1"));
	driver.switchTo().frame(frame1);
	WebElement subHead = driver.findElement(By.xpath("//*[@id=\"page\"]/a[1]"));
	subHead.click();
	
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		frameI();
		
	}//Main Method Ends Here

}//Class Ends Here
