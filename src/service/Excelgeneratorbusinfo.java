//package service;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.List;
//
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//
//import model.Travelinfo;
//
//
//
//public class Excelgeneratorbusinfo {
//
//	
//	FileOutputStream out;
//	public HSSFWorkbook excelGenerate(Travelinfo travelinfo, List<Travelinfo> list) throws IOException {
//		try {
//                  String filename="C:\\Users\\Amarthya\\Documents.xls";
//                  HSSFWorkbook hwb=new HSSFWorkbook();
//                  HSSFSheet sheet=hwb.createSheet("sheet");
//                  HSSFRow rowhead=sheet.createRow((short)0);
//                  rowhead.createCell((short)0).setCellValue("route");
//                  rowhead.createCell((short)1).setCellValue("fares");
//                  rowhead.createCell((short)2).setCellValue("schedule");
//                  
//                  int i=0;
//                  
//                  for(Travelinfo st: list ) {
//                	  
//                	  int j=i+1;
//                	  HSSFRow row=sheet.createRow((short)j);
//                	  row.createCell((short)0).setCellValue(st.getRoute());
//                	  row.createCell((short)1).setCellValue(st.getFares());
//                	  row.createCell((short)2).setCellValue(st.getSchedule());
//                    	  
//			}
//			
//			 out = new FileOutputStream(filename);
//			hwb.write(out);
//		
//			return hwb;
//			}
//		catch (Exception e) {
//				e.printStackTrace();
//			}
//		finally {
//			out.close();
//		}
//		return null;
//		
//	}
//}

