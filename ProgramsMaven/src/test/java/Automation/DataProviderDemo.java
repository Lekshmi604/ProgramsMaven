package Automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
//	@DataProvider(name = "data-provider")
//	public Object[][] dpMethod() {
//		return new Object[][] { { 2, 3 }, { 5, 7 }, {4, 8} };
//	}

	@Test(dataProvider = "data-provider",dataProviderClass = DataDemo.class)
	public void testCase1(int a,int b) {
		int c=a+b;
		System.out.println(c);

	}
}
