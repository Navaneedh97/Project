package apachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadXLS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        FileInputStream fis=new FileInputStream("E:\\Navanee\\EduBridge\\excel\\data.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		int count=sh.getLastRowNum();
		
		System.out.println("Total no.of rows: "+count);
		System.setProperty("webdriver.chrome.driver", "E:\\Navanee\\EduBridge\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
        d.manage().window().maximize();
		for(int i=0;i<=count;i++)
		{
			d.get("https://demo.guru99.com/test/newtours/index.php");
			d.findElement(By.name("userName")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			
			System.out.print(sh.getRow(i).getCell(0).getStringCellValue());
		    System.out.println(" "+sh.getRow(i).getCell(1).getStringCellValue());
		}

	}

}
