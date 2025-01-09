package oops;

public class Employee {
	
	String Name;
	int EmployeeID;
	int Salary;
	
	
	//Constructor creation
	
	public Employee(String Name,int EmployeeID, int Salary) {
		
		this.Name=Name;
		this.EmployeeID=EmployeeID;
		this.Salary=Salary;
		
		
	}
	
	public Employee(String Name, int EmployeeID) {
		
		this.Name=Name;
		this.EmployeeID=EmployeeID;
		
	}
	
	
	public void PrintEmployeeDetails() {
		
		System.out.println("Name of the employee "+Name);
		System.out.println("Name of the employee "+EmployeeID);
		System.out.println("Name of the employee "+Salary);
	}

}
