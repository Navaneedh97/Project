package seleniumProgram;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
        d.get("https://www.mycontactform.com/");
		
		List<WebElement> allinks=d.findElements(By.tagName("a"));
		
		int count=allinks.size();
		System.out.println("The total links in the home Page are: "+count);
		
		for (int i=0;i<count;i++)
		{
		System.out.println(allinks.get(i).getText());	
		}
		
	}

}
