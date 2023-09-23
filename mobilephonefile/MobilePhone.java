package mobilephonefile;

import java.util.*;

public class MobilePhone {

	public static final double MAX_SCREEN_SIZE = 8;
	
	private String owner;
	private String color;
	private double screenSize;
	private int num;
	private App app;
	private ArrayList<App> appStore;
	
	private static int numOfSMS;
	
	public MobilePhone() {
		owner = "defaultOwner";
		color = "white";
		screenSize = 5.0;
		
		//this("defaultOwner", "white", 5.0);
	}
	
	public MobilePhone(String owner, String color, double screenSize, App app, ArrayList<App> appStore) {
		this.owner = owner;
		this.color = color;
		this.screenSize = screenSize;
		this.app = app;
		this.appStore = appStore;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getSize() {
		return screenSize;
	}
	
	public int getNum() {
		return num;
	}
	
	public App getApp() {
		return app;
	}
	
	public ArrayList<App> getAppStore(){
		return appStore;
	}
	
	public void setAppStore(ArrayList<App> appStore) {
		this.appStore = appStore;
	}
	
	// public void setApp() {
	// 	this.app = app;
	// }
	
	public static int getNumOfSMS() {
		return numOfSMS;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSize(double screenSize) {
		if(screenSize > 8.0) {
			this.screenSize = 8.0;
		}else {
			this.screenSize = screenSize;
		}
	}
	
	public void changeOwner() {
		this.owner = "Tom";
	}
	
//	public MobilePhone colonePhone() {
///		return new MobilePhone(owner, color, screenSize);
//	}
	
	public void ring() {
		System.out.println("ring, ring, ring");
	}
	
	public String sendSMS(String receiver, String message) {
		numOfSMS++;
		num++;
		System.out.println("hi "+receiver + " " + message);
		return "successful";
	}
	
	public void printContent() {
		System.out.println("the owner is " + this.owner + "; the color is " + this.color + 
				"; the screen size is " + this.screenSize);
	}
}