package utility;

import java.util.Scanner;

public class Uservalidationinterface implements Uservalidation {

	@Override
	public boolean validateuser() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your phone number");
		
		String phonenumber=sc.nextLine();
		String phoneregex="(0/91)?[7-9][0-9]{9}";
		System.out.println("Please enter your name");
		
	String name=sc.nextLine();
		if(phonenumber.matches(phoneregex))
			return true;
		else 
			return false;
	}
}
