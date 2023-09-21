package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAsertion {
	WebDriver driver;
  @Test
  public void verifyTextOfLoginButton() {
	  WebElement loginButton=driver.findElement(By.name("login-button"));
	  String actualResult=loginButton.getText();
	  String expectedResult="LOGIN";
	  Assert.assertEquals(actualResult, expectedResult,"Login button text is not expected");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
