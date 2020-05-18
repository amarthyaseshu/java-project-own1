package model;

import java.util.ArrayList;
import java.util.List;
// getters and setters for travel info(route, fares, schedule) of mmts
public class Mmtstravelinfo {
public static List<String> mmtsroute=new ArrayList<String>();
public static List<String> mmtsfares=new ArrayList<String>();
public static List<String> mmtsschedule=new ArrayList<String>();
public static List<String> getMmtsroute() {
	return mmtsroute;
}
public static void setMmtsroute(List<String> mmtsroute) {
	Mmtstravelinfo.mmtsroute = mmtsroute;
}
public static List<String> getMmtsfares() {
	return mmtsfares;
}
public static void setMmtsfares(List<String> mmtsfares) {
	Mmtstravelinfo.mmtsfares = mmtsfares;
}
public static List<String> getMmtsschedule() {
	return mmtsschedule;
}
public static void setMmtsschedule(List<String> mmtsschedule) {
	Mmtstravelinfo.mmtsschedule = mmtsschedule;
}


}
