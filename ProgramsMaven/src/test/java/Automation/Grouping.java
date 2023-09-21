package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Grouping {
	@Test(groups = "smoke")
	public void testCase1() {
		System.out.println("case1");
	}

	@Test
	public void testCase2() {
		System.out.println("case2");
	}

	@Test(groups = "regression")
	public void testCase3() {
		System.out.println("case3");
	}

	@Test(groups = "smoke")
	public void testCase4() {
		System.out.println("case4");
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("beforemethord");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("aftermethord");
	}

}
