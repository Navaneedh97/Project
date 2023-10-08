package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
        d.manage().window().maximize();
        
        d.get("https://www.foundit.in/");
		
		d.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();
		Thread.sleep(5000);
		
		d.findElement(By.xpath("//*[@id=\"file-upload\"]")).click();
		

	}

}
