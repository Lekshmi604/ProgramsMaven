package elementRepositry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkingOfWorkersTab {
	WebDriver driver;

	public WorkingOfWorkersTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workers;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement borderColour;
	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorker;
	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workersTab;
	@FindBy(xpath = "//a[@aria-label='Delete']")
	WebElement titleDelete;
	@FindBy(id = "worker-title")
	WebElement selectTitle;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement backgroundColour;
	
	public void navigateToWorkersTab() {
		workers.click();

	}

	public String findBorderColour() {
		return borderColour.getCssValue("border-color");
	}

	public void navigateToCreateWorker() {
		createWorker.click();
	}

	public String selectDropDownValue() {

		Select s = new Select(selectTitle);
		s.selectByValue("Mrs");
		String real = s.getFirstSelectedOption().getText();
		return real;
	}

	public void tabOfWorkers() {
		workersTab.click();

	}

	public String verifyTheTitleOfDelete() {
		return titleDelete.getAttribute("title");

	}
	public String findBackgroundColour() {
		return backgroundColour.getCssValue("background-color");
	}
	
}
