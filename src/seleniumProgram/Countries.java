package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
        d.get("https://www.mycontactform.com/samples.php");
		
		WebElement dd=d.findElement(By.id("q9"));
		
		Select c=new Select(dd);
		
		dd.click();
		List <WebElement> l=c.getOptions();
		
		System.out.println("Total no.of countries in the drop down : "+ l.size());
		
	}

}
