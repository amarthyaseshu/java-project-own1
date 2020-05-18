package utility;

import java.util.Scanner;
// validating th employee based on the id and password
public class Employeevalidation {

	public static boolean validate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your credentials");
		System.out.println("Enter your id");
		String id=sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		if(id.equals("1") && password.equals("admin"))
			return true;
		else 
			return false;
	}
}
