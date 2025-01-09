package Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> q1 = new PriorityQueue<String>();
		
		q1.add("Kiran");
		q1.add("Divya");
		q1.add("Bujju");
		q1.add("Bujji");
		

		
		System.out.println(q1);
		
		//to retrive last data we peek()
		
		System.out.println(q1.peek());
		
		
		//poll() is used to remove the data
		System.out.println(q1.poll());

		System.out.println(q1);
		
		
		ArrayDeque<String> dq = new ArrayDeque<String>();
		
		dq.add("Kiran");
		dq.add("Divya");
		dq.add("Bujju");
		dq.add("Bujji");
		
		System.out.println(dq);
		
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		
		
	}

}
