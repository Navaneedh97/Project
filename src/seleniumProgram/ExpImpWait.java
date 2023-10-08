package seleniumProgram;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpImpWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/signin");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.findElement(By.name("email")).sendKeys("reena@gmail.com");
		
		d.findElement(By.name("password")).sendKeys("pass123");
		
		d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
		
		WebElement toast=d.findElement(By.id("toast-container"));
		System.out.println("The toast message" +toast.getText());
		
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(toast));
		
		d.findElement(By.linkText("Sign up")).click();
	

	}

}
