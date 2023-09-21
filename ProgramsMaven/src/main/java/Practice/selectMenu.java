package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectMenu {
	public static void main(String ags[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver(); 
		a.manage().window().maximize();
		a.get("");
		
	}

}
