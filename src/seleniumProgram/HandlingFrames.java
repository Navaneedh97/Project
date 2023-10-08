package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
        d.get("https://letcode.in/frame");
		
		//WebElement f1=d.findElement(By.id("firstFr"));
		
		//d.switchTo().frame(f1);
		
		d.switchTo().frame("firstFr");
		
		//d.switchTo().frame(0);
		
		d.findElement(By.name("fname")).sendKeys("Reena");
		Thread.sleep(2000);
		d.findElement(By.name("lname")).sendKeys("John");
		
		WebElement f2=d.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		d.switchTo().frame(f2);
		Thread.sleep(2000);
		d.findElement(By.name("email")).sendKeys("Reena@gmail.com");
		
		d.switchTo().parentFrame();
		Thread.sleep(2000);
		d.findElement(By.name("lname")).clear();
		Thread.sleep(2000);
		d.findElement(By.name("lname")).sendKeys("Benny");
		Thread.sleep(2000);
		
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//d.findElement(By.id("testing")).click();
		
		d.findElement(By.linkText("Work-Space")).click();
		
		
		
	}

}
