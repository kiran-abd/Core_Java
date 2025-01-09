package Test;

public class ArraysExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To store same set of multiple data array is used.
		
		int[] num1 = {10,20,30,40,50};
		
		//Total length of the array num1
		
		int length = num1.length;
		
		System.out.println("Total length of the array num1 "+length);
		
		//Value at 3 position is 
		
		System.out.println(num1[2]);
		
		//Value at last position
		System.out.println(num1[num1.length-1]);
		
		//Array of String Declaration and initialisation
		String[] nam = {"ABC", "DEF", "GHI"};
		
		String name = "Clean India Green India";
		
		//To split into words
		
		
		String[] splitword = name.split(" ");
		
		System.out.println(splitword.length);
		
		System.out.println(splitword[2]);
		
		System.out.println(splitword[splitword.length-1]);
		
		

	}

}
