package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfter {
	//public static void main(String args[]) {
		
	
		@BeforeMethod
		public void bfmethod() {
			System.out.println("it is executed before method");
		}
		
		@AfterMethod
		public void afmethod() {
			System.out.println("it is executed after method");
		}
		
		@BeforeTest
		public void bftest() {
			System.out.println("it is executed before test");
		}
		
		@AfterTest
		public void aftest() {
			System.out.println("it is executed after test");
		}
		
		@BeforeClass
		public void bfclass() {
			System.out.println("it is executed before class");
		}
		
		@AfterClass
		public void afclass() {
			System.out.println("it is executed after class");
		}
		
		@Test(groups = {"regression"})	
		public void TestCase1() {
			System.out.println("This is test case 1");
		}
		
		@Test
		public void TestCase2() {
			System.out.println("This is test case 2");
		}
		
		@Test
		public void TestCase3() {
			System.out.println("This is test case 3");
		}
		@Test
		public void TestCase4() {
			System.out.println("This is test case 4");
		}}
	
	


