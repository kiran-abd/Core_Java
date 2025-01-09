package Test;

public class VowelsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Find no of vowels in the string. 
		
		String name = "Clean India Green India";
		
		
		
		String str1 = name.toUpperCase();
		int vowelcount =0;
		
		for(int index=0; index<=str1.length() -1; index++) {
			
			
			char ch = str1.charAt(index);
			
			
			switch(ch){
			
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
		    
				vowelcount++;
		    break;
			}
			
			
			
			}
		System.out.println("Total no of vowel in the string is "+vowelcount);
		}
		
		
		
	}


		
		
