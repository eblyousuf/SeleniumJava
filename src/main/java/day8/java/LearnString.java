package day8.java;

public class LearnString {
	
	public static void main(String[] args) {
		
		String text1 = "    Focus on     "; // 1. String literal
		String text2 =  "Learning String";
		
	  String text = new String("Learning String"); // 2. String Object
	/*  String text2 = new String("Learning String");*/
	  
	  
	  System.out.println(text1);
	  System.out.println(text2);
		
	/*	
		System.out.println(System.identityHashCode(txt)); // identityHasgCode returns memory address of given String varialble name.
		System.out.println(System.identityHashCode(txt1));
				
		System.out.println(txt);
		System.out.println(txt1);*/	 
	  
	  
	  
	  /**
		 * String class to create and manipulate strings.
		 * 
		 * Methods
		 * 1) length // find the number of characters
		 * 2) charAt(index) // The character at the index
		 * 3) concat //Concatenate two strings only  2+"Std"
		 * 4) toString() // Convert an existing data type to String
		 * 5) subString(beginIndex, endIndex) //Extracts a particular portion of String
		 * 6) trim // Removes the white space on begining and End
		 * 7) toLowerCase, toUpperCase // to convert case
		 * 8) split('char') -- split(regex, limit) //
		 * 9) indexOf(chr) , lastIndexOf(chr) // the index of the first or last match
		 * 10)startsWith(s), endsWith(s), contains(s) // match
		 * 11)replace(oldChar, newChar), replaceAll(regex, replacement) // 
		 * 12)Immutable String, StringBuffer(ThreadSafe), StringBuilder(Not ThreadSafe) 
		 */
		
		// String Class Methods
		// 1. equals
		System.out.println(text1.equals(text2)); // "equals" compares values of given Strings
		System.out.println(text1 == text2);   // "==" compares memory address of String Variable
		
		
		// 2. Count of String -> length
		System.out.println(text1.length());
		
		// 3. concat -> if you want concat two Strings
		System.out.println(text1.concat(text2));
		
		String num = "10";
		String num1 = "test";
		int a = 10;
		int b = 5;
		
		System.out.println(num1 + a);
		System.out.println(a + b);
		
		// 4. trim
		System.out.println(text1);
		System.out.println(text1.trim());
		
		//5. substring - fetch partial string from the given String
		String text3 =  "ComparesC Values";
		System.out.println(text3.substring(9));
		System.out.println(text3.substring(6, 11));
		
		// 6. toLowerCase, toUpperCase
		System.out.println(text3.toLowerCase());
		System.out.println(text3.toUpperCase());
		
		// 7. charAt ---> returns character based on given index number
		System.out.println(text3.charAt(3));
		
		// 8. indexOf ---> return index number based on given character
		System.out.println(text3.indexOf('C'));
		System.out.println(text3.lastIndexOf('C'));
		
		
		// 9. 
		System.out.println(text3.startsWith("C"));
		System.out.println(text3.endsWith("s"));
		System.out.println(text3.contains("pares"));
		
		
		
		
	
		
		

		
		
		
	}

}
