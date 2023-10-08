package seleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		
		d.get("https://www.ebay.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=d.findElement(By.linkText("Electronics"));
		
		Actions a=new Actions(d);
		
		a.moveToElement(ele).build().perform();
		
		//clicking Smart watches in Electronics
		
		d.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[5]/a")).click();
		
		
	}

}
