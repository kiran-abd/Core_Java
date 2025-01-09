package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("John");
		list.add("George");
		list.add("Walt");
		list.add("Gomez");
	    list.addFirst("Jesus");
	    list.addLast("Mary");
		
		
		System.out.println(list);
		
		for(int index=0; index<list.size(); index++) {
			
			System.out.println(list.get(index));
		}
        list.remove(0);
        System.out.println(list);
        
        list.set(1, "Joseph");
        System.out.println(list);
        
        //To add data in between the index
        
        list.add(2, "Dravid");
        
        System.out.println(list);
        
	}

}
