package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import elementRepositry.HomePage;
import elementRepositry.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;

	@Test
	public void verofyLoginFeature() {
		LoginPage l = new LoginPage(driver);
		l.inputUserName("carol");
		l.inputPassword("1q2w3e4r");
		l.clickLoginButton();
		HomePage h = new HomePage(driver);
		String actual = h.getTextOfHomePage();
		String expected = "Welcome to Payroll Application";
		Assert.assertEquals(actual, expected, "login not successfull");
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
