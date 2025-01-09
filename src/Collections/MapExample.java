package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//In HashMap Insertion order will not be maintained.
		// Also the key is unique.
		
		
		HashMap<Integer,String> HM = new HashMap<Integer,String>();
		HM.put(1,"Kiran");
		HM.put(2, "Divya");
		HM.put(3, "Bujji");
		HM.put(4, "Bujju");
		
		
		//To retriew the data;
		System.out.println(HM);
		
		//To update the data
		HM.put(4, "Muthu");
		System.out.println(HM);
		
		//To retriev the specific data we use get.
         
		System.out.println(HM.get(3));
		
		
		//To retriew all the data using loop.
		
		for(Map.Entry<Integer, String> entry1 : HM.entrySet()) {
			
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
			
			//To retriew only keys
			
			for(int key: HM.keySet()) {
				
				System.out.println(key);
			}
			
			//to Retriew only the value
			
			for(String Value: HM.values()) {
				
				System.out.println(Value);
			}
			
		}
		
		
		
		//To remove/delete the data.
		
		HM.remove(4);
		
		System.out.println(HM);
		
		
		//In LinkedHashMap Insertion order will be maintained.
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1,"Kiran");
		map.put(12, "Divya");
		map.put(3, "Bujji");
		map.put(4, "Bujju");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry2: map.entrySet()) {
			
			System.out.println(entry2.getKey());
			System.out.println(entry2.getValue());
		}
		
		
		
		
		
		//In TreeMap insertion order will be maintained in asending order.
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();
		map1.put(1,"Kiran");
		map1.put(12, "Divya");
		map1.put(3, "Bujji");
		map1.put(2, "Bujju");
		
		System.out.println(map1);
		

	}

}
