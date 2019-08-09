import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void alert_Box() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\DragDrop\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/delete_customer.php");
			
			//Send keys And Get the element to be clicked
			
			WebElement textBox = driver.findElement(By.xpath("//input[@name='cusid']"));
			textBox.sendKeys("Idon'tknowdude");
			WebElement subBtn = driver.findElement(By.xpath("//input[@name='submit']"));
			subBtn.click();
			
			//Switch to the alert Box
			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			String alertText = alert.getText();
			System.out.println(alertText);
			alert.accept();
		/*
		 * Alert alert2 = driver.switchTo().alert(); Thread.sleep(2000);
		 * alert2.accept();
		 */
			
			
	}//Method Ends Here
	
	public static void main(String[] args) throws InterruptedException {
		alert_Box();
		
	}//Main Method Ends Here
	
}
