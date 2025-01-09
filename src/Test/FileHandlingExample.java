package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Order Confirmation 1234";
		
		
		try {
			FileOutputStream file = new FileOutputStream("result.txt");
			try {
				file.write(str.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
				

	}

}
 