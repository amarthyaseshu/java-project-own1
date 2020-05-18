
package model;

import java.io.IOException;

import controller.Employee;
//getters and setters, constructor for road work(adding and viewing)
public  class Employeeroadwork {
public String roadworkregion;
public String roadworklocality;
public String roadworkduration;


public String getRoadworkregion() {
	return roadworkregion;
}
public  void setRoadworkregion(String roadworkregion) {
	this.roadworkregion = roadworkregion;
}
public  String getRoadworklocality() {
	return roadworklocality;
}
public  void setRoadworklocality(String roadworklocality) {
	this.roadworklocality = roadworklocality;
}
public  String getRoadworkduration() {
	return roadworkduration;
}
public  void setRoadworkduration(String roadworkduration) {
	this.roadworkduration = roadworkduration;
}
//public  Employeeroadwork(String roadworkregion, String roadworklocality, String roadworkduration) {
//	super();
//	this.roadworkregion = roadworkregion;
//	this.roadworklocality = roadworklocality;
//	this.roadworkduration = roadworkduration;
//}
//public  void roadworkdisplay() throws IOException {
//	System.out.println("Road work going on in "+this.getRoadworkregion()+" in "+this.getRoadworklocality()+" for "+this.getRoadworkduration());
//	
//	Employee.employeeView();
//}


}
