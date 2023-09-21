package Automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDemo {
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { 2, 3 }, { 5, 7 }, {4, 8} };
	}
}
