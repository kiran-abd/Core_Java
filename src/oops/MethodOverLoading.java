package oops;


//Methodoverloading is having same methods with different parameters in the same class.
public class MethodOverLoading {
	
	public void sum(int a, int b) {
		
		int result = a+b;
		
		System.out.println(result);
		
	}
	
	public void sum(int a, int b, int c) {
		 int result = a+b+c;
		
		System.out.println(result);
	}
	

}
