package main;

import java.util.Random;

import model.ProcessInstance;
import application.HosRefApp;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		runHosRefProcess();
	}

	private static void runHosRefProcess() throws InterruptedException {
		int num = 2;
		int count = 0;
		while(count < num){
			Random rand = new Random();
			Thread.sleep(rand.nextInt(1000));
			System.out.println("Start a new instance:");
			Thread t = new Thread(new ProcessInstance(HosRefApp.hosRefModel, count));
			t.start();
			count++;
		}
		
	}
}
