package application;

import model.Activity;
import model.Process;

public class HosRefApp extends Process{
	public static HosRefApp hosRefModel = null;
	public HosRefApp(){
		//add each activity
		Activity a1 = new Activity("GetReferal");
		this.actis.add(a1);
		
		Activity a2 = new Activity("CheckIn");
		this.actis.add(a2);
		
		Activity a3 = new Activity("SeeDoctor");
		this.actis.add(a3);
		
		Activity a4 = new Activity("UpdateRefer");
		this.actis.add(a4);
		
		Activity a5 = new Activity("PayTreatment");
		this.actis.add(a5);
		
		Activity a6 = new Activity("GetReimburse");
		this.actis.add(a6);
		
		Activity a7 = new Activity("CompleteRefer");
		this.actis.add(a7);
	}
}
