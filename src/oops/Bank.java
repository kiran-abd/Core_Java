package oops;

abstract public class Bank {
	
	abstract public void deposit();
	abstract public void withdraw();
	abstract public void balance();
	
	public void welcome() {
		System.out.println("Welcome to bank");
	}

}
