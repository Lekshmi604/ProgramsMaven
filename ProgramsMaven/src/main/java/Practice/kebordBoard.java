package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kebordBoard {
	public static void main(String args[]) throws AWTException  {
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.google.co.in/");
		WebElement y=a.findElement(By.id("APjFqb"));
		y.sendKeys("selenium");
		Robot r=new Robot();
	r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
