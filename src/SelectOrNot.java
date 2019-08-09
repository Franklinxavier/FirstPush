import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOrNot {

	public static void selectOrNot() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//To maximize the browser window
		driver.manage().window().maximize();
		WebElement radBtn = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		boolean res = radBtn.isSelected();
		System.out.println("Is element selected "+res);
	}
	public static void main(String[] args) {
		selectOrNot();
	}//Main Method Ends Here
}//Class Ends Here
