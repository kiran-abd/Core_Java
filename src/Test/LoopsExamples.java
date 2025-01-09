package Test;

public class LoopsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 =1;
		
		// print 1 to 10
		
		while(num1<=10) {
			
			System.out.println(num1);
			num1 =num1+1;
			
			
		}
		
		//for loop to print 1 to 10 
		
		for(int count=1; count<=10; count++) {
			
			//We use continue to skip the specific value
			
			if(count==5) {
				
				continue;
			}
			
			System.out.println("Values inside the loopis "+count);
			
		}
		
       for(int count=1; count<=10; count++) {
			
			//We use break keyword to stop the execution at the specific value
			
			if(count==5) {
				
				break;
			}
			
			System.out.println("Values inside the loopis "+count);
		
	}
       
       //to print 10 to 1
       
       for(int val=10; val>=1; val--) {
    	   
    	   System.out.println("Value inside the loop is "+val);
       }
       
       // arrays with loop
         
       
       int[] count = {10,20,30,40,50};
       
       for(int index=0; index<count.length;index++) {
    	   
    	   System.out.println("Values inside the array is "+count[index]);
    	   
       }
       
       //another way to fetch the values in array is using for each loop
       
       for(int value:count) {
    	   
    	   System.out.println(value);
       }
       
       }
	

}
