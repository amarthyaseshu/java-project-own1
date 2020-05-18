package userservice;

import java.io.IOException;
import java.util.Scanner;

import usermodel.Userfeedback;
// adding feedback by the user
public class Userfeedback_op {
public  void feedbackop() throws IOException {
	Scanner sc=new Scanner(System.in);
	System.out.println("please give the feedback(please be specific)");
	String user_feedback=sc.nextLine();
	System.out.println("Thanks for ur valuable feedback");
	Userfeedback objfeed=new Userfeedback(user_feedback);
	objfeed.setFeedback(user_feedback);
	objfeed.displayuserfeedback();

}
}
