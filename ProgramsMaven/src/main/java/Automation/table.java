package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {//Dynamically generate an element from a table
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		
		List<WebElement> firstColoum= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		String locator="";
		for(int i=0;i<firstColoum.size();i++) {
			if(firstColoum.get(i).getText().equals("Ashton Cox")) {
			locator="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]";
			break;
			}
		}
		WebElement age=driver.findElement(By.xpath(locator));
		String s=age.getText();
		System.out.println(s);
	}

}
