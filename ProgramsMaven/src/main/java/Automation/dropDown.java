package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		WebElement drop=driver.findElement(By.id("multi-select-field"));
		
		Select s=new Select(drop);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		List<WebElement> list=s.getAllSelectedOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
	}

}
