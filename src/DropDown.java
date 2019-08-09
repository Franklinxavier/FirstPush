import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void dropNdDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskAll\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Hit the Browser
		driver.get("https://www.facebook.com/");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//For dropdown we have select the select element and pass it to the Select constructor as an argument
				WebElement selectElem = driver.findElement(By.id("day"));
				WebElement month = driver.findElement(By.id("month"));
				WebElement year = driver.findElement(By.id("year"));
				
				
		//Create obj for that select class for selecting options from the dropdown
				Select sel = new Select(selectElem);
				sel.selectByIndex(11);
				Thread.sleep(2000);
				Select sel1 = new Select(month);
				sel1.selectByValue("3");
				Thread.sleep(2000);
				Select sel2 = new Select(year);
				sel2.selectByVisibleText("1995");
				Thread.sleep(2000);
				driver.quit();
				
				}
				
					
			/*
			 * String j=null; if(i==0) { j="First value is";
			 * System.out.println(j+"---->"+allValues.get(i).getText()); } else if(i==1) {
			 * j="Second value is";
			 * System.out.println(j+"---->"+allValues.get(i).getText()); } else if(i==2) {
			 * j="Third value is"; System.out.println(j+"---->"+allValues.get(i).getText());
			 * }
			 */
					
				
				
				
				
	
	
	public static void main(String[] args) throws InterruptedException {
		
		dropNdDown();
		
	}
}
