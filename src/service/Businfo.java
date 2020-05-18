package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import controller.Employee;
import model.Travelinfo;
// In this class the employee can do functionality of adding and viewing like routes, fares and schedules
public class Businfo extends Travelinfo  {
	
	public Businfo(List<String> route, List<String> fares, List<String> schedule) {
		super(route, fares, schedule);
		}
	
	//to select which category 0f bus info to add by employee
	public static void busInfoType() throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please select the category of bus info you want to add");
		System.out.println("1.Bus route"+"\n"+"2.Bus fare"+"\n"+"3.Bus schedule"+"\n"+"4.exit");
		int employeebuscategory=Integer.parseInt(br.readLine());
		if(employeebuscategory==1) {
			addRoute();
		}
		else if(employeebuscategory==2) {
		addFare();
		}
		else 
			if(employeebuscategory==3) {
			addSchedule();
		}
			else if(employeebuscategory==4) {
				Employee.employeeView();
				
			}
	}
	
	// for adding routes by the employee
	protected static void addRoute() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int employee_response;
		do {
	System.out.println("Enter the route name  you want to add");
	
			String routename=br.readLine();
		route.add(routename);
		System.out.println("Enter the number of stops available in route you added");
				int num_of_places=Integer.parseInt(br.readLine());
				System.out.println("please enter "+num_of_places+" places");
		
		for(int i=1;i<=num_of_places;i++) {
						String places=br.readLine();
			route.add(places);
		}
		System.out.println("Do you want to add other routes, please give your response as 1 for yes or 2 for  no");
		employee_response=Integer.parseInt(br.readLine());
		}
		while(employee_response==1);
		if(employee_response==2) {
			
			busInfoType();
		}
	}
	
	// for adding fare by the employee
	protected static void addFare() throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int employee_response2;
		do {
		System.out.println("Please enter the number of category of buses you want to add fare");
		
		int num_fare_add=Integer.parseInt(br.readLine());
		System.out.println("please enter "+num_fare_add+" categories with name of category and price per person per stop");
		for(int i=1;i<=num_fare_add;i++) {
			String farevalue=br.readLine();
			fares.add(farevalue);
		}
		System.out.println("Do you want to add further, please give your response as 1 for yes or 2 for  no");
		employee_response2=Integer.parseInt(br.readLine());
		}
		while(employee_response2==1);
		if(employee_response2==2) {
			busInfoType();
		}
	}
	
	// for adding schedule by the employee
	
	protected static void addSchedule() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int employee_response3;
		do {
		System.out.println("Please enter the bus route for which you want to add schedule");
		String route_schedule=br.readLine();
		schedule.add(route_schedule);
		System.out.println("please add schedule for "+route_schedule);
		String route_schedule_add=br.readLine();
		schedule.add(route_schedule_add);
		System.out.println("Do you want to add further, please give your response as 1 for yes or 2 for  no");
		employee_response3=Integer.parseInt(br.readLine());
		}
		while(employee_response3==1);
		if(employee_response3==2) {
			
			busInfoType();
		}
	}
	
	
	
		//to select which category 0f bus info to add by employee
		public static void busInfoTypeView() throws  IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("please select the category of bus info you want to view");
			System.out.println("1.Bus route"+"\n"+"2.Bus fare"+"\n"+"3.Bus schedule"+"\n"+"4.exit");
			int empbuscategory=Integer.parseInt(br.readLine());
			if(empbuscategory==1) {
				viewRoute();
			}
			else if(empbuscategory==2) {
			viewFare();
			}
			else 
				if(empbuscategory==3) {
				viewSchedule();
			}
				else if(empbuscategory==4) {
					Employee.employeeView();
					
				}
		}
	
	// to view the added route by the employee
	public static void viewRoute() throws IOException {
		for(String routetext : route) {
			System.out.println(routetext);
			
			
				}
		
		
	}
	// to view the added fare by the employee
	public static void viewFare() throws IOException {
		for(String faretext : fares) {
			System.out.println(faretext);
			
	}
		
		
	}
	// to view the added schedule by the employee
	public static void viewSchedule() throws IOException {
		for(String scheduletext : schedule) {
			System.out.println(scheduletext);
			
	}
		
	}
	

}
