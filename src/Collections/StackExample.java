package Collections;

import java.util.Stack;
import java.util.stream.Gatherer.Integrator;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack1 =  new Stack<Integer>();
		
		
		//To add the data we use push
		stack1.push(4);
		stack1.push(8);
		stack1.push(6);
		//remove the value we use pop
		stack1.pop();
		stack1.push(9);
		
		
		
		System.out.println(stack1);
		
		
		//to retriew the data which is there at last we use peek()
		
		System.out.println(stack1.peek());
		
		

	}

}
