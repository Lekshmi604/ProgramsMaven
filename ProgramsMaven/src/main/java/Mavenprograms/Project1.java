package Mavenprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Project1 {
public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
    System.out.println(driver.getTitle());
    System.out.println( driver.getCurrentUrl());
     driver.navigate().to("https://www.google.com/");
     driver.navigate().back();
     driver.navigate().forward();
     driver.quit();
	
}
}
