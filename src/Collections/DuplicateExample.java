package Collections;

import java.util.HashSet;

public class DuplicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Green India Clean India";
		
		String[] string = name.split(" ");
		
		HashSet<String> set = new HashSet<String>();
		for(String word:string) {
			
			set.add(word);
			
		}
         System.out.println(set);
	}

}
