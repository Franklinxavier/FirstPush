import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void mulDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskTuesday\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement selElm = driver.findElement(By.id("multi-select"));
		Select sel = new Select(selElm);
		boolean multiple = sel.isMultiple();
		if (multiple) {
			sel.selectByIndex(0);
			Thread.sleep(1000);
			sel.selectByValue("New Jersey");
			Thread.sleep(1000);
			sel.selectByVisibleText("Texas");
		}
		
		
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			String j=null; 
			if(i==0) { 
				j="First value is";
			 System.out.println(j+"---->"+allSelectedOptions.get(i).getText());
			 }
			else if(i==1) {
			 j="Second value is";
			 System.out.println(j+"---->"+allSelectedOptions.get(i).getText());
			 }
			else if(i==2) {
			 j="Third value is"; 
			 System.out.println(j+"---->"+allSelectedOptions.get(i).getText());
			 }
		}//For loop ENds here
		
		sel.deselectByVisibleText("Texas");
		Thread.sleep(1000);
		sel.deselectByValue("New Jersey");
		Thread.sleep(1000);
		sel.deselectByIndex(0);
		
		
	}//Method ends here
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		mulDropDown();
		
		
		
		
	}//main method ends here

}//class ENds Here
