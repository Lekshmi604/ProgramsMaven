package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookLogin{
public static void main(String args[])throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver f=new ChromeDriver();
	f.get("https://www.facebook.com/login/");
	f.manage().window().maximize();
	WebElement l=f.findElement(By.id("email"));
	l.sendKeys("AAA");
	WebElement g=f.findElement(By.id("pass"));
	g.sendKeys("LLL");
	WebElement j=f.findElement(By.name("login"));
	Thread.sleep(2000);
	j.click();
	Thread.sleep(2000);
	f.close();
	//WebElement k=f.findElement(By.className("_9ay7"));
	//System.out.println(k.getText());
	
	//String s=f.getTitle();
	//System.out.println(f);
	
}
}
