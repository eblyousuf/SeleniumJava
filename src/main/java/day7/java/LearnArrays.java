	package day7.java;

	import java.util.Arrays;

	public class LearnArrays {

	public static void main(String[] args) {

		// Data Types:- 1. Primitive DataTypes and NonPrimitive DataType

		// num = 9600234
		//float, short, boolean, bit, byte

		short num0 = 1;
		int num1 = 10; // 32 bit size		
		long num2 = 11111111111111111l;

		double num3 = 10.10;
		float num4 = 10.10f;

		boolean num5 = false;
		char ch = 'p';


		String txt = "yousuf";



		// syntax for Arrays:
		// names = "yousuf", "shihab", "Mamun"				

		//1. How to store the values into Arrays(Note: Two ways available)

		// first way
		String[] names = {"yousuf", "shihab", "abcd", "mamun"}; 		
		int[] ph = {123, 456, 789, 1 ,2 ,3 ,4};		
		char[] ch1 = {'a', 'b', 'c', 'd'};


		// Second way		
		//ClassName obj = new ClassName();
		String[] obj = new String[4];
		obj[0] = "yousuf";
		obj[1] = "shihab";
		obj[2] = "Mamun";
		obj[3] = "xyz";



		//2. How to pick value from Array ---> array[indexNumber]		
		System.out.println(obj[0]);


		//3. how to get count of Array ---> array.lenght
		System.out.println(obj.length);// how many value in arry


		//4. how to Sort the Arrays ----> Arrays.sort()		
		System.out.println(names[0]);		
		//Arrays.sort(names);		
		System.out.println(names[0]);

		System.out.println("**********************************************************");


		//5. using for iterator, while loops and forEach		

		for (int i= 0; i < obj.length; i++) {			
			System.out.println(obj[i]); //  value not know use key word obj.length in for loop
		}

		//String[] obj = new String[4];
		//obj[0] = "yousuf";
		//obj[1] = "shihab";
		//obj[2] = "Mamun";
		//obj[3] = "xyz";	

		System.out.println("-------------------------------------------------------------");

		//1.
		for(String eachObj : obj) {			
			System.out.println(eachObj); // syntax for(String each Collection : Collection)
		}		

		System.out.println("-------------------------------------------------------------");

		//2.		
		for(int i= 0; i <=3; i++) {			
			System.out.println(obj[i]);
		}		

		System.out.println("-------------------------------------------------------------");

		//3.		
		int i =0;
		while (i<=3) {				
			System.out.println(obj[i]);
			i++;
		}




	}



}
