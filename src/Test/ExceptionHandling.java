package Test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=10;
		
		try {
		int result = n/0;
		
		System.out.println(result);
		
		}catch(ArithmeticException e) {
			
			System.out.println("Inside the try and  catch block");
			
		}finally{
			
			System.out.println("Inside the finaly block");
			
		}
		
		System.out.println("After try and catch block");
		
		
	}
}