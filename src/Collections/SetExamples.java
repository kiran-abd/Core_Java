package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//HashSet: cannot retriew the data in order, it prints in random order
		//Null value can be stored in the hashset
		//duplicate values cannot be stored
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Kiran");
		set1.add("Karan");
		set1.add("raju");
		set1.add("Karthik");
		
		
		System.out.println(set1);
		
		///LinkedHashSet:can retriew the data in order.
		//Null value can be stored in the hashset
		//duplicate values cannot be stored
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set2.add("Kiran");
		set2.add("Karan");
		set2.add("raju");
		set2.add("Karthik");
		
		System.out.println(set2);
		
		///TreeSet:can retriew the data in Asending order.
		//Null value cannot be stored in the hashset
		//duplicate values cannot be stored
		
		TreeSet<String> set3 = new TreeSet<String>();
		set3.add("Kiran");
		set3.add("Karan");
		set3.add("raju");
		set3.add("Karthik");
		set3.add("Bhanu");
		
		System.out.println(set3);
		
		
		String str1 = "Clean India Green India";
		
			
			
		
			String[] Str2 = str1.split(" "); 
			
			
			HashSet<String> hs = new HashSet<String>();
			
			for(int index=0; index<Str2.length -1; index++) {
				
				System.out.println(hs.add(Str2[index]));
			
				
				
				
			}
			
	
		
			
			
			
			
			
			
			
	
		
		
		
		
		
		

		
		
		
		
		
	}

}
