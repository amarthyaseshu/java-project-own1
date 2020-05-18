package usercontroller;

import java.io.IOException;
import java.util.Scanner;

import controller.Prostart;
import service.Businfo;
import service.Mmtsinfo;
import userservice.Userfeedback_op;
import utility.Uservalidation;
import utility.Uservalidationinterface;
// for navigating user to different categories based on selection
public class User {
       public static void userView() throws IOException {
    	   Uservalidation objint=new Uservalidationinterface();
    	   
    	   if(objint.validateuser()==true) {
    		   System.out.println("Thank you for login");
    	   
			int user_category;
			do {
			System.out.println("please select the below category");		
		    System.out.println("1.View Bus Info" +"\n"+"2.View MMts Info"  +"\n"+"3.View Road Work Info" +"\n"+"4.Add Feedback"+"\n"+"5.Exit" );
			Scanner sc=new Scanner(System.in);
			user_category=sc.nextInt();
			switch(user_category)
			{
			case 1:
				System.out.println("going to view bus info");
				Businfo.busInfoTypeView();
				userView();
				
			break;
			case 2:System.out.println("going to view mmts info");
			Mmtsinfo.mmtsInfoTypeView();
			userView();
			break;
			
			case 3:System.out.println("going to view road work info");
			
			break;
			case 4:System.out.println("going to add feedback");
			
			Userfeedback_op objaddfeed=new Userfeedback_op();
			objaddfeed.feedbackop();
			
			break;
			case 5:
			Prostart.main(null);
			break;
			
			default:System.err.println("PLEASE SELECT CATEGORY CORRECTLY");
			
			}
			}
			while(user_category!=1 && user_category!=2 && user_category!=3 && user_category!=4 && user_category!=5);
					
		}
		else {
			// the phone number is validated by regex, if user enters faulty phone number, he cant enter
			System.out.println("please enter a valid phone number");
			Prostart.main(null);
		}
	}
	

}
