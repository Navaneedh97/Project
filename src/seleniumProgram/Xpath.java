package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
        d.manage().window().maximize();
        d.get("https://www.mycontactform.com/samples/businesscontact.php");
        
        d.findElement(By.xpath("//input[@id='email']")).sendKeys("navanee@gmail.com");
        
        Thread.sleep(2000);
        
        d.findElement(By.xpath("//input[@id='q[1]']")).sendKeys("Navanee");
        
        Thread.sleep(2000);
        
        d.findElement(By.xpath("//*[@cols='40']")).sendKeys("Muthaiya Nagar");
        //Link Text
        d.findElement(By.xpath("//a[text()='Pricing']")).click();
        d.findElement(By.xpath("//a[text()='About Us']")).click();
        d.findElement(By.xpath("//a[text()='Home']")).click();
        
        //Partial Link Text
        d.findElement(By.xpath("//a[contains(text(),'Feat')]")).click();
        d.findElement(By.xpath("//a[contains(text(),'Hel')]")).click();
        d.findElement(By.xpath("//a[contains(text(),'Resou')]")).click();
        
        //starts-with
        d.findElement(By.xpath("//a[starts-with(text(),'About')]")).click();
        d.findElement(By.xpath("//a[starts-with(text(),'Sam')]")).click();
        d.findElement(By.xpath("//a[starts-with(text(),'Pri')]")).click();
        
        //ends-with
        //dynamic
        //parent
        //child
        //Ancestor
        //Following
        //Preceeding
        //sibling
        //following sibling
        //Preceeding Sibling
	}

}
