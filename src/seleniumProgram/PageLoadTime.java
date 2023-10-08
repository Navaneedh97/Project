package seleniumProgram;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageLoadTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
        d.manage().window().maximize();
        
        d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(d.getTitle());
		
	}
 
}
