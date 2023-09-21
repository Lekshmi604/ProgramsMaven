package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment2 {
	WebDriver driver;

	@Test
	public void workingOfLoginFeature() {

		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.name("LoginForm[password]"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();

		WebElement newPage = driver.findElement(By.className("container-fluid"));
		boolean actualResult = newPage.isDisplayed();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult, "Login feature is not working properly");
	}

	@Test
  public void verifyTextOfSearchAndReset() {
	  
	  WebElement userName=driver.findElement(By.id("loginform-username"));
	  userName.sendKeys("carol");
	  WebElement password=driver.findElement(By.name("LoginForm[password]"));
	  password.sendKeys("1q2w3e4r");
	  WebElement loginButton=driver.findElement(By.name("login-button"));
	  loginButton.click();
	  
	 WebElement client=driver.findElement(By.xpath("//a[text()='Clients']"));
	 client.click();
	  
	  WebElement search=driver.findElement(By.xpath("//button[@class='btn btn-primary']")) ;
	  String actualResult=search.getText();
	  String expectedResult="Search";
	  SoftAssert s=new SoftAssert();
	  s.assertEquals(actualResult, expectedResult,"Search button is not present");
		 
	  WebElement reset=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
	  String actual=reset.getText();
	  String expected="Reset";
		 s.assertEquals(actual, expected,"Reset button is not present");
		 s.assertAll();
	  }

	@Test
	public void verifyBackgroundColourOfSearchAndReset() {

		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.name("LoginForm[password]"));
		password.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		
		
	    WebElement workers=driver.findElement(By.xpath("//a[text()='Workers']"));
	    workers.click();
		WebElement bgSearch = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		String actual = bgSearch.getCssValue("background-color");
		String expected = "rgba(51, 122, 183, 1)";
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual, expected,"background colour not fount");

		WebElement bgReset = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		String actualResult = bgReset.getCssValue("color");
		String expectedResult = "rgba(51, 51, 51, 1)";
		s.assertEquals(actualResult, expectedResult,"background colour not fount");
		s.assertAll();

	}

	@BeforeMethod
	 @Parameters("browser")
	public void beforeMethod(String browserName) {
		if(browserName.equals("chrome")) {
			  WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(); 
		  }else if(browserName.equals("edge")){
			  WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		  }

		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}}
