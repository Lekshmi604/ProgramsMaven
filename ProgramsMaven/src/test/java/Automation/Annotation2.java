package Automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
  @Test
  public void f() {
	  System.out.println("llll");
  }
  @Test
  public void f1() {
	  System.out.println("uuuu");
  }
  @Test
  public void f2() {
	  System.out.println("xxxx");
  }


//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("bbb");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("aaa");
//  }
//@BeforeClass
//public void h1() {
//	System.out.println("oooo");
//}
//@AfterClass
//public void h2() {
//	System.out.println("qqq");
//}
  @BeforeTest
  public void s1() {
	  System.out.println("ggg");
  }
  @AfterTest
  public void s2() {
	  System.out.println("gg");
  }
}

