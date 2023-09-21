package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionLogin {
	WebDriver driver;
  @Test
  public void loginIsDisplayed() { 
	  WebElement logoLogin=driver.findElement(By.tagName("h1"));
	  boolean actualResult=logoLogin.isDisplayed()	;
	  boolean expectedResult=true;
	 // Assert.assertEquals(actualResult, expectedResult,"Login logo is not displated");
	  
	 SoftAssert s=new SoftAssert();
	 s.assertEquals(actualResult, expectedResult,"Login logo is not displated");
	 System.out.println("2222");
	 s.assertAll();
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
//if assertion undergo fail then the remaning lines will not work is called hard assertion
//
