package ExcelWrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class HSSFWriteExcel {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		HSSFWriteExcel obj=new HSSFWriteExcel();
		obj.write();
	}

	public void write() throws FileNotFoundException, IOException {  // must download "apachi-poi-jar" (or) "depedency"
		
		HSSFWorkbook w=new HSSFWorkbook();
		HSSFSheet wsheet=w.createSheet("FirstHSSF");
		HSSFRow r=wsheet.createRow(0);
		HSSFCell c=r.createCell(0);
		c.setCellValue("amma");
		w.write(new FileOutputStream("SimpleHSSF.xls"));
		w.close();

	}
}
