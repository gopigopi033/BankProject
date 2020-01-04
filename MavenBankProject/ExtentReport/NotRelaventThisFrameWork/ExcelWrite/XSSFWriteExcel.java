package ExcelWrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFWriteExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		XSSFWriteExcel obj=new XSSFWriteExcel();
		obj.xssfwrite();
	}
	
	public void xssfwrite() throws FileNotFoundException, IOException {     // must download "apachi-poi-ooxml-jar" (or) "depedency" 
		
		//File loc=new File("SimpleXSSF.xlsx"); //already available excel location.
		XSSFWorkbook w=new XSSFWorkbook();
		XSSFSheet wsheet=w.createSheet("FirstHSSF");
		XSSFRow r=wsheet.createRow(0);
		XSSFCell xcell=r.createCell(0);
		xcell.setCellValue("amma");
		//FileOutputStream o=new FileOutputStream(loc); //this is one way for already existing excel file.
		w.write(new FileOutputStream("SimpleXSSF.xlsx"));
		w.close();
	}

}
