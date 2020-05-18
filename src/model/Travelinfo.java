package model;

import java.util.ArrayList;
import java.util.List;
//getters and setters, constructor for travel info(route, fares, schedule) of bus
public class Travelinfo {
public static List<String> route=new ArrayList<String>();
public static List<String> fares=new ArrayList<String>();
public static List<String> schedule=new ArrayList<String>();
public List<String> getRoute() {
	return route;
}
public void setRoute(List<String> route) {
	Travelinfo.route = route;
}
public List<String> getFares() {
	return fares;
}
public void setFares(List<String> fares) {
	Travelinfo.fares = fares;
}
public List<String> getSchedule() {
	return schedule;
}

public void setSchedule(List<String> schedule) {
	Travelinfo.schedule = schedule;
}
public Travelinfo(List<String> route, List<String> fares, List<String> schedule) {
	super();
	Travelinfo.route = route;
	Travelinfo.fares = fares;
	Travelinfo.schedule = schedule;
}

}
