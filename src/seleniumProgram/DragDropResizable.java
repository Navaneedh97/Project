package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
        d.get("https://jqueryui.com/droppable/");
		
		WebElement f1=d.findElement(By.className("demo-frame"));
		d.switchTo().frame(f1);
		
		WebElement drag=d.findElement(By.id("draggable"));
		
		WebElement drop=d.findElement(By.id("droppable"));
		
		Actions act=new Actions(d);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		d.switchTo().parentFrame();
		
		d.findElement(By.linkText("Resizable")).click();
		
		WebElement f2=d.findElement(By.className("demo-frame"));
		d.switchTo().frame(f2);
		
		WebElement widget=d.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		act.clickAndHold(widget).moveByOffset(180, 100).release().build().perform();
		
		// For Right Click (act.contextClick())
		
		

	}

}
