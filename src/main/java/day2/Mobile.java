package day2;

public class Mobile {
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.sendSMS();
		obj.accout_details();
		obj.recharge();
		obj.sample();
	}
	
	
	// Access_modifier return_type method_Name(){
	
    //body of the method	
	
//}
	
	// 1. Method level - Access Modifiers - 4 types of access Modifiers -> public, default or No_modifier, protected, private
	public void sendSMS() {
		System.out.println("Sending msg");
	}
	
	
	void accout_details() {
		System.out.println("with in my family");
	}
	
	
	void recharge() {
		System.out.println("Recharged");
	}
	
	
	protected void sample() {
		
	}
	
	

}
