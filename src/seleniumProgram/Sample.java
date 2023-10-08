package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.mycontactform.com/");
		
		System.out.println("Title of the HomePage:" +d.getTitle());
		
		d.findElement(By.linkText("Sample Forms")).click();
		
		//check box
		
		d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
		
		// Textbox
		
		d.findElement(By.id("subject")).sendKeys("selenium");
		Thread.sleep(2000);
		d.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		Thread.sleep(2000);
		d.findElement(By.id("q1")).sendKeys("Software testing");
		
		//dropdown
		WebElement dd=d.findElement(By.id("q3"));
		
		dd.click();
		Select c=new Select(dd);
		
		c.selectByIndex(2);
		Thread.sleep(2000);
		c.selectByValue("Fourth Option");
		Thread.sleep(2000);
		c.selectByVisibleText("First Option");
		
		// Radio Button
		d.findElement(By.cssSelector("input[value='Second Option']")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[value='Fourth Option']")).click();
		
		//Date selector
		 d.findElement(By.id("q7")).click();
		 // click to move to the next month
		 
		 d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		 
		 d.findElement(By.linkText("12")).click();
		 
		 //Upload File
		 
		 d.findElement(By.id("attach4589")).sendKeys("path");
	}
 }
