import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableWebColRow {

	public static void webTabCol(String str) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskTuesday\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		//For Row Wise Selection
		
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		 List<WebElement> trow = tbody.findElements(By.tagName("tr"));
		 
		 for (WebElement xrow : trow) {
			 WebElement rTh = xrow.findElement(By.tagName("th"));
			List<WebElement> xrowCell = xrow.findElements(By.tagName("td"));
			String val = rTh.getText();
			if (val.equals(str)) {
				for (int i = 0; i < xrowCell.size(); i++) {
					System.out.println(xrowCell.get(i).getText());
					
				}//For loop Inside if Ends Here
				
			}//If statement Ends Here
			
			
		}//For Loop Ends Here
		 
		 
		 
	}//Method Ends Here
	
	/*
	 * public static void colWise() { System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\XAVIER FRANKLIN.LAPTOP-SHVITRR3\\eclipse-workspace\\TaskTuesday\\Drivers\\chromedriver.exe"
	 * ); WebDriver driver = new ChromeDriver();
	 * //driver.get("https://www.toolsqa.com/automation-practice-table/");
	 * 
	 * WebElement table = driver.findElement(By.tagName("table")); WebElement thead
	 * = table.findElement(By.tagName("thead")); WebElement headRow =
	 * thead.findElement(By.tagName("tr"));
	 * 
	 * //Getting All Those Rows Which Contains Td WebElement tbody =
	 * table.findElement(By.tagName("tbody")); List<WebElement> trow =
	 * tbody.findElements(By.tagName("tr"));
	 * 
	 * List<WebElement> headTh = headRow.findElements(By.tagName("th")); for
	 * (WebElement hTh : headTh) { int col=0;
	 * 
	 * if (headTh.equals(agmt)) { for (WebElement xrow : trow) {
	 * xrow.findElement(By.) }
	 * 
	 * }//If Ends Here else { col++; }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * }//Second Method Ends Here
	 */
	public static void main(String[] args) {
		webTabCol("Burj Khalifa");
		
	}//Main Method Ends Here
	
}//Class Ends Here
