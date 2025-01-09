package Test;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = num1+num2;
		int sub = num2-num1;
		int mul = num1*num2;
		float div = (float) num1/num2;
		
		
		//String result = "Sum of two numbers is " + sum;
		
		System.out.println("Sum of two numbers is " + sum);
		System.out.println("sub of two numbers is " + sub);
		System.out.println("mul of two numbers is " + mul);
		System.out.println("div of two numbers is " + div);
		
		
		String name = "Clean india Green India";
		
		// To find the length of the string we use length()
		
		System.out.println("Length of the string is "+name.length());
		
		//To find the char at index position we use charAt();
		
		char chr = name.charAt(2);
		char chr1 = name.charAt(name.length()-1);
		
		
		
		// To find last char in the string we use length() -1;
		
		
		System.out.println("Character at postion 2 in string is "+chr);
		System.out.println("Character at last position in string is "+chr1);
		//To convert the string to uppercase we use touppercase()
		System.out.println(name.toUpperCase());
		
		//To convert the string to Lowercase we use toLowercase()
		System.out.println(name.toLowerCase());
		
		
		

		
		
	
		

	}

}
