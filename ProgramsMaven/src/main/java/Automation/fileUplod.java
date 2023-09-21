package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUplod {
	public static void main(String args[]) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		
		WebElement choose=driver.findElement(By.id("uploadfile_0"));
		
	
		Actions a=new Actions(driver);
		a.moveToElement(choose).click().perform();
		
		StringSelection s=new StringSelection("file:///C:\\Users\\hp\\Desktop\\Lekshmi%20raj\\Difference.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r=new Robot();
		r.delay(250);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.delay(250);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(250);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
