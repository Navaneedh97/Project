package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
       d.manage().window().maximize();
		
		d.get("https://www.google.com/");
		
		//WebElement s=d.findElement(By.name("q"));
		//String Tooltip=s.getAttribute("title");
		
		String tooltip=d.findElement(By.name("q")).getAttribute("title");
		
		System.out.println("The tooltip is: "+tooltip);
		if(tooltip.contentEquals("Google"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
