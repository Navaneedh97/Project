package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DataDriven {
	WebDriver d;
	
	  @Test(priority=2, dataProvider = "dp1")
	  public void login(String un, String pswd) {
		  d.findElement(By.name("userName")).sendKeys(un);
		  d.findElement(By.name("password")).sendKeys(pswd);
		  d.findElement(By.name("submit")).click();
		  
	  }
	  
	  @Test(priority=1, dataProvider = "dp2")
	  public void register(String fn, String ln, String phn) {
		  d.findElement(By.linkText("REGISTER")).click();
		  d.findElement(By.name("firstName")).sendKeys(fn);
		  d.findElement(By.name("lastName")).sendKeys(ln);
		  d.findElement(By.name("phone")).sendKeys(phn);
		  
	  }
	  
	  
  @BeforeMethod
  public void beforeMethod() {
	  d.manage().window().maximize();
	  d.get("https://demo.guru99.com/test/newtours/");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Done");  
  }


  @DataProvider
  public Object[][] dp1() {
	  return new Object[][] {
	      new Object[] { "Navanee", "Navaneedh11" },
	      new Object[] { "Navarasan", "Navarasan12" },
	      new Object[] { "Nitin", "Nitin14" },
	      new Object[] { "Makizh", "Makizh13" },
	    };
  }
  
  
  @DataProvider
  public Object[][] dp2() {
    return new Object[][] {
      new Object[] { "Navanee", "Navaneedh11", "2158823167" },
      new Object[] { "Navarasan", "Navarasan12", "1236547589"},
      new Object[] { "Nitin", "Nitin14", "7569841253" },
      new Object[] { "Makizh", "Makizh13", "1563249874" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webelement.chrome.driver", "E:\\Navanee\\Testing\\Selenium\\Software\\chrome driver 107\\chrome.exe");
	  d=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Operation Success"); 
	  d.quit();
  }

}
