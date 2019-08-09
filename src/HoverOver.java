import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
	public static void mouseOver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\DragDrop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement CategoryBtn = driver.findElement(By.id("nav-link-shopall"));
		Actions ma = new Actions(driver);
		ma.moveToElement(CategoryBtn).perform();
		WebElement primeBtn = driver.findElement(By.xpath("(//span[text()='Amazon Prime Video'])[1]"));
		ma.moveToElement(primeBtn).perform();
		WebElement tvShowBtn = driver.findElement(By.xpath("//span[text()='TV Shows']"));
		ma.moveToElement(tvShowBtn).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		mouseOver();
	}//Main Method Ends Here
}//Class Ends Here
