package mobilephonefile;

import java.util.*;

public class MobilePhoneApplication {

	public static void main(String[] args) {
		
		MobilePhone myPhone;
		myPhone = new MobilePhone();
		
		myPhone.setOwner("Jane");
		
		myPhone.sendSMS("tom", "hi");
		
		myPhone.setSize(10.0);
		
		System.out.println("the size of my phone is: " + myPhone.getSize());
		
		App app = new App("Facebook", 0.0);
		
		App app1 = new App("wechat", 0.0);
		App app2 = new App("whatsup", 0.0);
		App app3 = new App("Angry Bird", 2.0);
		
		ArrayList<App> appStore = new ArrayList<App>();
		appStore.add(app1);
		appStore.add(app2);
		appStore.add(app3);
		
		MobilePhone johnPhone = new MobilePhone("John","Red", 7.0, app, appStore);
		johnPhone.sendSMS("tom", "hi");
		//johnPhone.printContent();		
		
		//System.out.println("the number of SMS sent: " + myPhone.getNum());
		
		//System.out.println("the number of SMS sent so far is: " + MobilePhone.getNumOfSMS());
		
		//System.out.println("the current owner is: " + myPhone.getOwner());
		
		//johnPhone.getApp().print();
		
		johnPhone.getAppStore().get(2).print();
		
		//MobilePhone copyPhone = myPhone.colonePhone();
		
		//myPhone.changeOwner();
		//myPhone.printContent();
		//System.out.println("the onwer is " + myPhone.owner);
		
		
		//copyPhone.printContent();
		

		
	}
	
}