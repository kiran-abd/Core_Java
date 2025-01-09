package Test;

import java.util.Scanner;

public class EvenNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int num = scanner.nextInt();
		
		
		if(num%2 == 0) {
			
			
			System.out.println("Entered value is Even number");
			
		}
		
		else {
			
			System.out.println("Entered value is not a even number");
		}
		
	scanner.close();
	
	}

}
