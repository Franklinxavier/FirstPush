import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HandleWindow {

	public static void winHandle() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskTuesday\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Google.com/");
		//Get window id
		String fId = driver.getWindowHandle();
		//Goto images window using context click..FOr that get img element
		Actions ma = new Actions(driver);
		WebElement img = driver.findElement(By.xpath("//a[@data-pid='2']"));
		ma.contextClick(img).build().perform();
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease((KeyEvent.VK_DOWN));
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease((KeyEvent.VK_DOWN));
		Thread.sleep(1000);
		//ENter on new window
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		//Get the second window id
		
		String sId = driver.getWindowHandle();
		
		//Switch Back to the home window
		Set<String> windows = driver.getWindowHandles();
		for (String w : windows) {
			if (!w.equals(fId)) {
				driver.switchTo().window(w);
				Thread.sleep(3000);
				driver.close();
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		winHandle();
	}

}
