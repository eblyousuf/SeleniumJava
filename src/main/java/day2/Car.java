package day2;

public class Car {
	
	//Static methods
	public static void main(String[] args) {		
		//Create the Object
		// Syntax
		//ClassName objName = new ClassName();
		Car obj = new Car();
		
		obj.driveCar();
		obj.isPunctured();
		obj.soundHorn();
	
	}
	
	//methods		
	//methods Signature - 4 or 5 things	
	// Access_modifier return_type method_Name(){				
	                       //body of the method	
//}
	
	//Non-Static Methods
	public void driveCar() {
		System.out.println("I'm driving");		
	}
	
	public void isPunctured() {
		System.out.println("No");
	}
	
	public void soundHorn() {
		System.out.println("Horn.......");
	}
	

}
