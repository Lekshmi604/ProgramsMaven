package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form {
	public static void main(String args[])throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		a.get("https://demoqa.com/automation-practice-form");
		a.manage().window().maximize();
		WebElement d = a.findElement(By.id("firstName"));
		d.sendKeys("AARMIN");
		WebElement e = a.findElement(By.id("lastName"));
		e.sendKeys("RAJEEV");
		WebElement f = a.findElement(By.id("userEmail"));
		f.sendKeys("lekshmiraj604@gmail.com");
		WebElement g = a.findElement(By.className("custom-control-label"));
		g.click();
		WebElement h = a.findElement(By.id("userNumber"));
		h.sendKeys("8943736992");
		WebElement i = a.findElement(By.id("dateOfBirthInput"));
		i.click();
		
		 
		WebElement q=a.findElement(By.className("react-datepicker__month-select"));
		q.
		
		WebElement j=a.findElement(By.className("subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3"));
		j.sendKeys("Maths");
		WebElement k=a.findElement(By.className("custom-control-label"));
		k.click();
		WebElement m=a.findElement(By.id("currentAddress"));
		m.sendKeys("kkaakkkakkka");
		WebElement s=a.findElement(By.cssSelector(" css-1hwfws3"));
		Select ff=new Select(s);
		ff.selectByIndex(5);
		Thread.sleep(5000);
		a.close();	}

}
