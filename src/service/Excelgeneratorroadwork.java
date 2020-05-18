package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.Employeeroadwork;

// this excel is for viewing roadwork details added by employee in excel
public class Excelgeneratorroadwork {

	
	FileOutputStream out;
	public HSSFWorkbook excelGenerate(Employeeroadwork employeeroadwork, List<Employeeroadwork> list) throws IOException {
		try {
                  String filename="C:\\Users\\Amarthya\\Documents.xls";
                  HSSFWorkbook hwb=new HSSFWorkbook();
                  HSSFSheet sheet=hwb.createSheet("sheet");
                  HSSFRow rowhead=sheet.createRow((short)0);
                  rowhead.createCell((short)0).setCellValue("roadwork region");
                  rowhead.createCell((short)1).setCellValue("roadwork locality");
                  rowhead.createCell((short)2).setCellValue("roadwork duration");
                  
                  int i=0;
                  
                  for(Employeeroadwork st: list ) {
                	  
                	  int j=i+1;
                	  HSSFRow row=sheet.createRow((short)j);
                	  row.createCell((short)0).setCellValue(st.getRoadworkregion());
                	  row.createCell((short)1).setCellValue(st.getRoadworklocality());
                	  row.createCell((short)2).setCellValue(st.getRoadworkduration());
                    	  
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


