package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.Employee;
// this is for adding mmts info(routes, fares, schedules)
public class Mmtschild extends Mmtsinfo {

	@Override
	public void mmtsInfoType() throws  IOException {
		// for navigating to different categories like route, fare, schedule by employee for adding
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please select the category of mmts info you want to add");
		System.out.println("1.Mmts route"+"\n"+"2.Mmts fare"+"\n"+"3.Mmts schedule"+"\n"+"4.exit");
		int employeemmtscategory=Integer.parseInt(br.readLine());
		if(employeemmtscategory==1) {
			addMmtsRoute();
		}
		else if(employeemmtscategory==2) {
		addMmtsFare();
		}
		else 
			if(employeemmtscategory==3) {
			addMmtsSchedule();
		}
			else if(employeemmtscategory==4) {
				Employee.employeeView();
				
			}
	}
// for adding mmts routes by employee
	@Override
	public void addMmtsRoute() throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int mmtsemployee_response;
		do {
	System.out.println("Enter the route name  you want to add");
	
			String mmtsroutename=br.readLine();
		mmtsroute.add(mmtsroutename);
		System.out.println("Enter the number of stops available in route you added");
				int mmtsnum_of_places=Integer.parseInt(br.readLine());
				System.out.println("please enter "+mmtsnum_of_places+" places");
		
		for(int i=1;i<=mmtsnum_of_places;i++) {
						String mmtsplaces=br.readLine();
			mmtsroute.add(mmtsplaces);
		}
		System.out.println("Do you want to add other stops, please give your response as 1 for yes or 2 for  no");
		mmtsemployee_response=Integer.parseInt(br.readLine());
		}
		while(mmtsemployee_response==1);
		if(mmtsemployee_response==2) {
			mmtsInfoType();
		}
		
	}
// for adding mmts fare by employee
	@Override
	public void addMmtsFare() throws  IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int mmtsemployee_response2;
		do {
		System.out.println("Please enter the number of category of mmts you want to add fare");
		
		int mmtsnum_fare_add=Integer.parseInt(br.readLine());
		System.out.println("please enter "+mmtsnum_fare_add+" categories with name of category and price per person per stop");
		for(int i=1;i<=mmtsnum_fare_add;i++) {
			String mmtsfarevalue=br.readLine();
			mmtsfares.add(mmtsfarevalue);
		}
		System.out.println("Do you want to add further, please give your response as 1 for yes or 2 for  no");
		mmtsemployee_response2=Integer.parseInt(br.readLine());
		}
		while(mmtsemployee_response2==1);
		if(mmtsemployee_response2==2) {
			mmtsInfoType();
		}
	}
// for adding mmts schedule by the employee
	@Override
	public void addMmtsSchedule() throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int mmtsemployee_response3;
		do {
		System.out.println("Please enter the mmts route for which you want to add schedule");
		String mmtsroute_schedule=br.readLine();
		mmtsschedule.add(mmtsroute_schedule);
		System.out.println("please add schedule for "+mmtsroute_schedule);
		String mmtsroute_schedule_add=br.readLine();
		mmtsschedule.add(mmtsroute_schedule_add);
		System.out.println("Do you want to add further, please give your response as 1 for yes or 2 for  no");
		mmtsemployee_response3=Integer.parseInt(br.readLine());
		}
		while(mmtsemployee_response3==1);
		if(mmtsemployee_response3==2) {
			mmtsInfoType();
		}
	}

}

