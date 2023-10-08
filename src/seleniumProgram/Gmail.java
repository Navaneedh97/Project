package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		// clicking on next button
		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		Thread.sleep(2000);
		
		WebElement e=d.findElement(By.className("o6cuMc"));
		String error=e.getText();
		
		String et="Enter your email Id";
		 System.out.println("Expected text: "+et);
		
		 System.out.println("Actual Text: "+ error);
		 
		if(error.contentEquals(et))
		{
			 System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");	
		}
		
		Thread.sleep(2000);
	   
		d.findElement(By.id("identifierId")).sendKeys("#@%#$%^%$");
		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		d.findElement(By.id("identifierId")).clear();
		
		d.findElement(By.id("identifierId")).sendKeys("selenium@gmail.com");
		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	}

}
