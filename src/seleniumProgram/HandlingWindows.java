package seleniumProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/windows");
		String pw=d.getWindowHandle();
		System.out.println("Id of Parent window: "+pw);
		
		d.findElement(By.id("home")).click();
		Set <String> wh=d.getWindowHandles();
		System.out.println("Id of all the Active windows: "+wh);
		
		System.out.println("Title: "+d.getTitle());
		System.out.println("URL: "+d.getCurrentUrl());
		
		//d.close();
		List <String> l=new ArrayList<String>(wh);
		
		d.switchTo().window(l.get(1));
		
		System.out.println("Child window Title: "+d.getTitle());
		System.out.println("Child URL: "+d.getCurrentUrl());
		
		d.findElement(By.id("testing")).click();
		
		System.out.println("After clearing the old list");
	
		
		Set <String> wh1=d.getWindowHandles();
		l.clear();
		l.addAll(wh1);
		d.switchTo().window(l.get(0));
		System.out.println("Title: "+d.getTitle());
		System.out.println("URL: "+d.getCurrentUrl());	
		
		//d.quit();
	}

}
