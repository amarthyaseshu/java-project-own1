package controller;

import java.io.IOException;
import java.util.Scanner;

import usercontroller.User;

public class Prostart {

	public static void main(String[] args) throws IOException {
		System.out.println("Hyderabad Transportation Portal");
		int category_select;
		do {
	System.out.println("Please select the category you belong");
	System.out.println("1. Employee"+ "\n" +"2. User");
	Scanner sc=new Scanner(System.in);
 category_select=sc.nextInt();
//moving to the category depending upon selection
switch(category_select)
{

case 1:
	//going to employee class
	Employee.employeeView();
	break;
case 2:
	//going to user class
	User.userView();
	break;
default:
	System.out.println("please select 1 or 2");
}
		}
		// selecting faulty option
		while(category_select!=1 && category_select!=2 );
		
	}

}
