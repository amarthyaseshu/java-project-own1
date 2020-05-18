package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.Employee;
import model.Mmtstravelinfo;

public abstract class Mmtsinfo extends Mmtstravelinfo {

	
	
	public  abstract  void mmtsInfoType() throws IOException;
	
	protected abstract void addMmtsRoute() throws IOException;
	
	protected abstract void addMmtsFare() throws IOException;
	
	protected abstract void addMmtsSchedule() throws IOException;
	// for navigating to different category for viewing
	public static void mmtsInfoTypeView() throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please select the category of mmts info you want to view");
		System.out.println("1.Mmts route"+"\n"+"2.Mmts fare"+"\n"+"3.Mmts schedule"+"\n"+"4.exit");
		int empmmtscategory=Integer.parseInt(br.readLine());
		if(empmmtscategory==1) {
			viewMmtsRoute();
		}
		else if(empmmtscategory==2) {
		viewMmtsFare();
		}
		else 
			if(empmmtscategory==3) {
			viewMmtsSchedule();
		}
			else if(empmmtscategory==4) {
				Employee.employeeView();
				
			}
	}

	// for viewing mmts route
	public static void viewMmtsRoute() throws IOException {
		
		for(String mmtsroutetext : mmtsroute) {
			System.out.println(mmtsroutetext);
			
				}
		
	}
	// for viewing mmts fare
	public static void viewMmtsFare() throws IOException {
		
		for(String mmtsfaretext : mmtsfares) {
		System.out.println(mmtsfaretext);
		
}
		
	}
	// for viewing mmts schedule
public static void viewMmtsSchedule() throws IOException {
		
	for(String mmtsscheduletext : mmtsschedule) {
		System.out.println(mmtsscheduletext);
		
}	
	
	
	}
	
	
}
