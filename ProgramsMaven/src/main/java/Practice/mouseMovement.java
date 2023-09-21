package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseMovement {
	public static void main(String args[])throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://demoqa.com/buttons");
		

		Actions g=new Actions(a);
		
		WebElement c=a.findElement(By.id("doubleClickBtn"));
		WebElement d=a.findElement(By.id("rightClickBtn"));
		WebElement e=a.findElement(By.id("TZLpl"));
		
		g.doubleClick(c).perform();
		Thread.sleep(3000);
		g.contextClick(d).perform();
		Thread.sleep(3000);
		g.click(e).perform();
		Thread.sleep(3000);
		a.close();		
		
	}

}
