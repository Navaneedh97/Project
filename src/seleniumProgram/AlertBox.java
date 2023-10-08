package seleniumProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
	   
		//get url
		d.get("https://demo.guru99.com/test/delete_customer.php");
		//find the element
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("78760");

		d.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		//1) confirmation alert
		
		System.out.println(d.switchTo().alert().getText());
		
		Thread.sleep(2000);
		//ok button
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//dismiss
		d.switchTo().alert().dismiss();
	
		
	}

}
