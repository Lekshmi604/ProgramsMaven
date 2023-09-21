package elementRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	WebDriver driver;
	public ClientPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Clients']")
	WebElement client;
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement search;
	
	public void navigateToClientTab() {
		client.click();
	}
	public String getSearchButtonText() {
		return search.getText();
		
		
	}
	public String verifyTheTitleOfView() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
