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

public class AssigmentDemo {
	WebDriver driver;
	 public void verifyLoginOfValidUser(){
			WebElement userName = driver.findElement(By.id("loginform-username"));
			userName.sendKeys("carol");
			WebElement password = driver.findElement(By.id("loginform-password"));
			password.sendKeys("1q2w3e4r");
			WebElement loginButton = driver.findElement(By.name("login-button"));
			loginButton.click();
			WebElement textOfWelcomePage = driver.findElement(By.xpath("//p[text()='Welcome to Payroll Application']"));
			String actualResult = textOfWelcomePage.getText();
			String expectedResult = "Welcome to Payroll Application";
			Assert.assertEquals(actualResult, expectedResult, "login successfully");
		   }
	   @Test
	  public void verifyTextOfSearchAndResetButtonsOfClientsTab(){
			WebElement userName = driver.findElement(By.id("loginform-username"));
			userName.sendKeys("carol");
			WebElement password = driver.findElement(By.id("loginform-password"));
			password.sendKeys("1q2w3e4r");
			WebElement loginButton = driver.findElement(By.name("login-button"));
			loginButton.click();
			
			driver.navigate().to("https://www.qabible.in/payrollapp/client/index");
			WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			String actualResult = searchButton.getText();
			String expectedResult = "Search";
			SoftAssert s = new SoftAssert();
			s.assertEquals(actualResult, expectedResult, "text of search button is verified");
		  
			WebElement resetButton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
			String actualResult1 = resetButton.getText();
			String expectedResult1 = "Reset";
			s.assertEquals(actualResult1, expectedResult1, "text of reset button is verified");
			s.assertAll();
		   }
	   @Test
	  public void verifyBackgroundColorOfSearchAndResetButtonsOfWorkersTab()  {
		    WebElement userName=driver.findElement(By.id("loginform-username"));
			userName.sendKeys("carol");
			WebElement password=driver.findElement(By.id("loginform-password"));
			password.sendKeys("1q2w3e4r");
			WebElement loginButton=driver.findElement(By.name("login-button"));
			loginButton.click();
			
			driver.navigate().to("https://www.qabible.in/payrollapp/worker/index");
			WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			String actualResult = searchButton.getCssValue("background-color");
			String expectedResult = "rgba(51, 122, 183, 1)";
			SoftAssert s = new SoftAssert();
			s.assertEquals(actualResult, expectedResult, "background color of search button is verified");
			
			WebElement resetButton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
			String actualResult1 = resetButton.getCssValue("background-color");
			String expectedResult1 = "rgba(255, 255, 255, 1)";
			s.assertEquals(actualResult1, expectedResult1, "background color of reset button is verified");
			s.assertAll();
		  
	  }
	  @BeforeMethod
	  @Parameters("browser")
	  public void beforeMethod(String browserName)  {
		  if(browserName.equals("chrome")) {
			  WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(); 
		  }else if(browserName.equals("edge")){
			  WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
		  }
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver.get("https://www.qabible.in/payrollapp/site/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

	}

		