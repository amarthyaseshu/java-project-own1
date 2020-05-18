package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Employeeroadwork;
import service.Businfo;
import service.Employeeroadworkop;
import service.Excelgeneratorroadwork;
import service.Mmtschild;
import service.Mmtsinfo;
import usermodel.Userfeedback;
import utility.Employeevalidation;

public  class Employee {
	public static void employeeView() throws IOException {
	//first checking the employee and accesing employee features
		
		if(Employeevalidation.validate()) {
			System.out.println("login succesful");
			int employee_category;
			do {
			System.out.println("please select the below category");		
		    System.out.println("1.Add Bus Info" +"\n"+"2.Add MMts Info"  +"\n"+"3.View Bus Info" +"\n"+"4.View MMts Info"+"\n"+"5.Add Road Work Info"+"\n"+"6.View Road Work Info"+"\n"+"7.View userfeedback"+"\n"+"8.Exit" );
			Scanner sc=new Scanner(System.in);
			employee_category=sc.nextInt();
			switch(employee_category)
			{
			case 1:
				//going to add bus info
			Businfo.busInfoType();
			break;
			case 2:
				//going to add mmts info
			Mmtsinfo objmmts=new Mmtschild();
			objmmts.mmtsInfoType();
			break;
			case 3:
				//going to view bus info
			Businfo.busInfoTypeView();
			Businfo.busInfoTypeView();
			break;
			case 4:
				//going to view mmts info
			Mmtsinfo.mmtsInfoTypeView();
			Mmtsinfo.mmtsInfoTypeView();
			break;
			case 5:
				//going to add road work info
			Employeeroadworkop.roadworkop();
			Employeeroadworkop.roadworkdisplay();
			break;
			case 6:
				//going to view road work info
				List<Employeeroadwork> objl=new ArrayList<Employeeroadwork>();
				System.out.println(objl);
//			Excelgeneratorroadwork excelroad=new Excelgeneratorroadwork();
//			excelroad.excelGenerate(null, null);
			
			
//			Employeeroadwork objviewroad=new Employeeroadwork();
//objviewroad.roadworkdisplay();
			break;
			case 7:
				//going to view user feedback
			Userfeedback objfeed=new Userfeedback(null);
			objfeed.displayuserfeedback();
			break;
			case 8:
				// Exiting and again going to start
				Prostart.main(null); break;
				//if employee selects any option not provided 
			default:System.err.println("PLEASE SELECT CATEGORY CORRECTLY");
			}
			}
			while(employee_category!=1 && employee_category!=2 && employee_category!=3 && employee_category!=4 && employee_category!=5 && employee_category!=6 && employee_category!=7);			
		}
		else {
			//if employee enters wrong credentials
			System.out.println("login unsuccesful");
			Prostart.main(null);
		}
	}
	

}
