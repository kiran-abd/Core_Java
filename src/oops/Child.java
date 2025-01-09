package oops;

public class Child extends Person{
	
	public String Profession;
	
	
	public Child() {
		
	}
	
	public Child(String Name, int Age, String Profession ) {
		
		super(Name,Age);
		this.Profession=Profession;
	}
	
	
	public void display() {
		
		System.out.println("Inside the ChildClass");
	}
	
	public void Print() {
		
		
		System.out.println("Inside The Child");
		
	}

}
