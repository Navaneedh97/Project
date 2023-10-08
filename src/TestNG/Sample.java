package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Sample {
	@Test
	  public void f1() {
		  System.out.println("Test Case1");
		  
	  }
	  @Test
	  public void f2() {
		  System.out.println("Test Case2");
		  
	  }
	  @Test
	  public void f3() {
		  System.out.println("Test Case3");
		  
	  }
	  @Test
	  public void f4() {
		  System.out.println("Test Case4");
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("Open the URL");
	  }
	  

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Close URL");
		  
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Open the Browser");
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("Close the Browser");
  }

}
