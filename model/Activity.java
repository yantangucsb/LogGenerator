package model;

import java.util.Map;

public class Activity {
	public String name;
	public Map<String, String> attRead, attWrite;
	
	public Activity(String name){
		this.name = name;
	}
}
