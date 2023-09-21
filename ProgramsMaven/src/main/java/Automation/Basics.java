package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basics {
	public static void main(String args[])  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		
		
		WebElement login=driver.findElement(By.name("LoginForm[username]"));
		String s=login.getCssValue("background-color");
		System.out.println(s);
		String fontSize=login.getCssValue("font-weight");
		System.out.println(fontSize);
		String fontType=login.getCssValue("font-family");
		System.out.println(fontType);
		String clas=login.getAttribute("class");
		System.out.println(clas);
		String name=login.getAttribute("name");
		System.out.println(name);
		String tagName=login.getTagName();
		System.out.println(tagName);
		
		
		
	}

}
