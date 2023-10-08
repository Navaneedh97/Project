package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
        d.get("https://www.facebook.com/");
		
		WebElement img=d.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
		
		if (img.isDisplayed())
		{
			 System.out.println("Image is dispalyed :"+ img.getAttribute("alt"));
		}
		else
		{
			 System.out.println("Image is not dispalyed ");
		}
		
		d.navigate().to("https://www.oracle.com/java/technologies/downloads/#java8-windows");
		
		d.findElement(By.className("u30-oicn")).click();
		
		System.out.println(d.getTitle());
		
		System.out.println(d.getCurrentUrl());

	}

}
