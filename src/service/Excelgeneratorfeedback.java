package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import usermodel.Userfeedback;

// this excel sheet is for viewing feedback given by user in excel

public class Excelgeneratorfeedback {

	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(Userfeedback userfeedback, List<Userfeedback> list) throws IOException {
		try {
                  String filename="C:\\Users\\Amarthya\\Documents.xls";
                  HSSFWorkbook hwb=new HSSFWorkbook();
                  HSSFSheet sheet=hwb.createSheet("sheet");
                  HSSFRow rowhead=sheet.createRow((short)0);
                  rowhead.createCell((short)0).setCellValue("Userfeedback");

                  
                  int i=0;
                  
                  for(Userfeedback st: list ) {
                	  
                	  int j=i+1;
                	  HSSFRow row=sheet.createRow((short)j);
                	  row.createCell((short)0).setCellValue(st.getFeedback());

                    	  
			}
			
			 out = new FileOutputStream(filename);
			hwb.write(out);
		
			return hwb;
			}
		catch (Exception e) {
				e.printStackTrace();
			}
		finally {
			out.close();
		}
		return null;
		
	}
}

