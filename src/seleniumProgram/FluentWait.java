package seleniumProgram;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
        d.manage().window().maximize();
        
        d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.findElement(By.name("username")).sendKeys("Admin");
		
		d.findElement(By.name("password")).sendKeys("admin123");
		
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		/*Wait<WebDriver> wait=new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement admin=wait.until(new Function<WebDriver , WebElement>()
				{
			public WebElement apply(WebDriver d)
			{
				return d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
			}
	});
	
      admin.click();
      */
	}

	
	}


