package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass1;
import elementRepositry.HomePage;
import elementRepositry.LoginPage;
import elementRepositry.WorkingOfWorkersTab;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseWorkersTab extends BaseClass1 {
	

	@Test
	public void verifyBorderColourOfSearchButton() {
		LoginPage l = new LoginPage(driver);
		l.inputUserName("carol");
		l.inputPassword("1q2w3e4r");
		l.clickLoginButton();
		HomePage h = new HomePage(driver);
		h.getTextOfHomePage();

		WorkingOfWorkersTab w = new WorkingOfWorkersTab(driver);
		w.navigateToWorkersTab();
		String actual = w.findBorderColour();
		String expected = ("rgb(46, 109, 164)");
		Assert.assertEquals(actual, expected, "Bordercolour is not fount");
	}

	@Test
	public void createWorker() {
		LoginPage l = new LoginPage(driver);
		l.inputUserName("carol");
		l.inputPassword("1q2w3e4r");
		l.clickLoginButton();
		HomePage h = new HomePage(driver);
		h.getTextOfHomePage();
		WorkingOfWorkersTab w = new WorkingOfWorkersTab(driver);
		w.navigateToWorkersTab();
		w.navigateToCreateWorker();
		w.selectDropDownValue();
		String actual = w.selectDropDownValue();
		String expected = "Mrs";
		Assert.assertEquals(actual, expected, "Value not found");
	}

	@Test
	public void verifyDeleteText() {
		LoginPage l = new LoginPage(driver);
		l.inputUserName("carol");
		l.inputPassword("1q2w3e4r");
		l.clickLoginButton();
		HomePage h = new HomePage(driver);
		h.getTextOfHomePage();
		WorkingOfWorkersTab w = new WorkingOfWorkersTab(driver);
		w.navigateToWorkersTab();
		w.tabOfWorkers();
		String actual = w.verifyTheTitleOfDelete();
		String expected = "Delete";
		Assert.assertEquals(actual, expected, "Text not found");
	}

	

}
