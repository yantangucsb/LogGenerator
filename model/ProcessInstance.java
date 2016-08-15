package model;

import java.util.Map;

public class ProcessInstance implements Runnable {
	Process pro;
	int id;
	Map<String, String> atts;
	
	public ProcessInstance(Process model, int id){
		pro = model;
		this.id = id;
	}
	
	@Override
	public void run() {
		System.out.println("Process instance " + id + " running.");
	}
}
