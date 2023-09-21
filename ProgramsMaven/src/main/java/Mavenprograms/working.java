package Mavenprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class working {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		WebElement text=d.findElement(By.cssSelector("input[name='email']"));
		text.sendKeys("yy");
		WebElement select=d.findElement(By.name("login"));
		select.click();
		WebElement t=d.findElement(By.className("_9ay7"));
		System.out.println(t.getText());
		String f=d.getTitle();
		System.out.println(f);
		
	}

}
