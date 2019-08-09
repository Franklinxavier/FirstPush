import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void doubleClick() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\DragDrop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.manage().window().maximize();
		
		//Getting Elements from the webpage
		
		WebElement textBox = driver.findElement(By.id("fname"));
		WebElement subBtn = driver.findElement(By.id("idOfButton"));
		WebElement dblClkBtn = driver.findElement(By.id("dblClkBtn"));
		
		//Create Action Interface
		
		Actions mouse = new Actions(driver);
		
		//Performing the Elements
		
		textBox.sendKeys("Lemme login");
		subBtn.click();
		mouse.doubleClick(dblClkBtn).build().perform();
		
		
	}
	public static void main(String[] args) {
		doubleClick();
	}
}
