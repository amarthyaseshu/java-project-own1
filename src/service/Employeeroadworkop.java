package service;

import java.io.IOException;
import java.util.Scanner;

import controller.Employee;
import model.Employeeroadwork;
//for adding roadwork details by the employee
public  class Employeeroadworkop {
	static Employeeroadwork emproad=new Employeeroadwork();
public static void roadworkop() throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the region in which roadwork going on");
	String roadworkregion=sc.nextLine();
	System.out.println("Please enter the locality in which roadwork going on");
	String roadworklocality=sc.nextLine();
	System.out.println("Please enter the duration for which  roadwork may going on");
	String roadworkduration=sc.nextLine();
	
	emproad.setRoadworkregion(roadworkregion);
	emproad.setRoadworklocality(roadworklocality);
	emproad.setRoadworkduration(roadworkduration);
//	emproad.roadworkdisplay();
}

public static void roadworkdisplay() throws IOException {
	System.out.println("Road work going on in "+emproad.getRoadworkregion()+" in "+emproad.getRoadworklocality()+" for "+emproad.getRoadworkduration());
	
	Employee.employeeView();
}
}
