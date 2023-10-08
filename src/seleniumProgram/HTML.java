package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("https://letcode.in/table");
		WebElement table=d.findElement(By.id("simpletable"));
		List <WebElement> head=table.findElements(By.tagName("th"));
		
		for(WebElement h:head)
		{
			String txt=h.getText();
			System.out.println(txt);
		}
		
		List <WebElement> rows=table.findElements(By.cssSelector("tbody tr"));
		
		int count=rows.size();
		System.out.println("No.of Rows in the table :" +count);
		if(count==3)
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
			
		}
		
		for(WebElement r:rows)
		{
			List <WebElement> col=r.findElements(By.tagName("td"));
			String fn=col.get(0).getText();
			System.out.print(fn);
			
			String ln=col.get(1).getText();
			
			System.out.print(" "+ln);
			
			String e=col.get(2).getText();
						
			System.out.println(" "+e);
		}

	}

}
