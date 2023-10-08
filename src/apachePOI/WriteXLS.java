package apachePOI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteXLS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 FileInputStream fis=new FileInputStream("E:\\Navanee\\EduBridge\\excel\\data1.xlsx");
		   
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   
		   XSSFSheet sh=wb.getSheet("Sheet1");
		   
		   Row r0=sh.createRow(0);
		   
		   Cell c0=r0.createCell(0);
		   c0.setCellValue("Navaneedh");
		   
		   Cell c1=r0.createCell(1);
		   c1.setCellValue("Anbarasan");
		   
		   
		   Row r1=sh.createRow(1);
		   
		   Cell c2=r1.createCell(0);
		   c2.setCellValue("Makizh");
		   
		   Cell c3=r1.createCell(1);
		   c3.setCellValue("JagaveeraPandiyan");
		   
		   FileOutputStream fos=new FileOutputStream("E:\\Navanee\\EduBridge\\excel\\data1.xlsx");
		   
		   wb.write(fos);
		   
		   System.out.println("End of writing");
		
		
	}

}
