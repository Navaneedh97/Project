package seleniumProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardFunction {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
        d.manage().window().maximize();
       
        d.get("https://www.selenium.dev/downloads/");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);				
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		/*
		d.get("https://www.redbus.in/");
		
		Robot r=new Robot();
		//d.navigate().to("https://www.redbus.in/");
		
		d.findElement(By.id("src")).sendKeys("ch");
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
           */
	}

}
