package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment3 {
	WebDriver driver;
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { {"username" ,"password"}, { "kkkkk","1234" } ,{"oooo","7845"}};
	}
  @Test(dataProvider = "data-provider")
  public void invalidUsernameAndPassword(String a,String b) {
	  
	  
	WebElement username=driver.findElement(By.id("loginform-username")); 
	username.sendKeys(a);
	WebElement password=driver.findElement(By.id("loginform-password"));
	password.sendKeys(b);
	WebElement login=driver.findElement(By.name("login-button"));
	login.click(); 
	
	
	WebElement errorMessage=driver.findElement(By.xpath("//p[text()='Incorrect username or password.']"));
	String actualResult= errorMessage.getText();
	String expectedResult="Incorrect username or password.";
	Assert.assertEquals(actualResult, expectedResult,"Text not found");
  }
  @BeforeMethod
	 
	public void beforeMethord() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  }
  @AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
  
