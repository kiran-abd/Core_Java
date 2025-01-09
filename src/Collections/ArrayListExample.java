package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =  new ArrayList<String>();
		
		list.add("Kiran");
		list.add("Karan");
		list.add("Karthik");
		list.add("Kishore");
		
		
		//To retriev all the values we use 
		
		System.out.println(list);
		
		
		
		// To retriev the size of the array is
		
		System.out.println("Size of the arraylist is "+list.size());
		
		
		//To retriev any specific value
		
		System.out.println("value at oth index is "+ list.get(0));
		
		
		//To remove any value at specific index
		
		System.out.println(list.remove(0));
		
		
		System.out.println(list);
		
		list.set(1, "Suresh"); //To replace the value 
		
		System.out.println(list);
		
		
		// To retriev the size of the array is
		
			System.out.println("Size of the arraylist is "+list.size());
			
			
			for(int index=0; index<list.size(); index++) {
				
				System.out.println(list.get(index));
			}
		   
			 for(String arraylist:list) {
				 
				 System.out.println(arraylist);
			 }
		
		
		
		//Sorting the arraylist in asending order we use collections class.
			 
			 Collections.sort(list);
			 
			 System.out.println(list);
			 
			//Sorting the arraylist in desending order we use collections class.
			 
			 Collections.reverse(list);
			 
			 System.out.println(list);
		

	}

}
