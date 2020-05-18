package usermodel;

import java.io.IOException;

import usercontroller.User;
// getters and setters, constructors for feedback section
public class Userfeedback {

	public String feedback;

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public Userfeedback(String feedback) {
		super();
		this.feedback = feedback;
	}

	public void displayuserfeedback() throws IOException {
		System.out.println(this.getFeedback());
		User.userView();
	}
}
