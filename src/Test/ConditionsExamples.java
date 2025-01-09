package Test;

import java.util.Scanner;

public class ConditionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int age = scanner.nextInt();
		
		if(age>=18)
			
		{
			System.out.println("Eligible for voting");
			
		}
		else if (age == 17) {
			
			System.out.println("Not Eligible for voting this time, try next year");
		}
		
		else
		{
			System.out.println("Not eligible for voting");
		}
		
		scanner.close();
		
		
	}

}
