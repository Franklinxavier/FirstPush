import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PathX {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the browser window
		driver.manage().window().maximize();
		//Hit the Browser
		driver.get("https://www.facebook.com/");
		
		//To Locate Element Using Xpath
		
		WebElement firstelem = driver.findElement(By.xpath("//input[@name='firstname']"));
		System.out.println("First Element Using Xapth ---->"+firstelem);
		WebElement secelem = driver.findElement(By.xpath("//input[@name='lastname']"));
		System.out.println("First Element Using Xapth ---->"+secelem);
		WebElement thirdtelem = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		System.out.println("First Element Using Xapth ---->"+thirdtelem);
		
		
	}

}
