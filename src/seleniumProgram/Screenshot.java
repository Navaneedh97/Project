package seleniumProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
        d.get("https://www.vrlbus.in/");
		
		TakesScreenshot ts=(TakesScreenshot)d;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Navanee\\EduBridge\\Screenshot\\img1.png");
		
		FileHandler.copy(src, dest);
				
		
		WebElement ele=d.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[1]/a/img"));
		
        File src1=ele.getScreenshotAs(OutputType.FILE);
		
		File dest2=new File("E:\\Navanee\\EduBridge\\Screenshot\\img2.png");
		
		FileHandler.copy(src1, dest2);
		
	}

}
