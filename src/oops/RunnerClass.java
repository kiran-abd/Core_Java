package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1 = new Employee();
		
		emp1.Name="Kiran";
		emp1.EmployeeID=205809;
		emp1.Salary=1100000;
		
		
		Employee emp2 = new Employee();
		emp2.Name="Karan";
		emp2.EmployeeID=2058091;
		emp2.Salary=1000000;
		
		emp1.PrintName();
		emp2.PrintName(); */
		
		//Ways to create constructor object and calling
		
		Employee emp1 = new Employee("Kiran",205809,1100000);
		Employee emp2 = new Employee("Karan",2025809,11100000);
		Employee emp3 = new Employee("ilay",20000);
	
		
		emp1.PrintEmployeeDetails();
		emp2.PrintEmployeeDetails();
		emp3.PrintEmployeeDetails();
		
		
		Child chd = new Child("Kiran",2000,"Doctor");
		
		chd.display();
		chd.Print();
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum(5, 4);
		obj.sum(4, 1, 10);
		
		
		ICICBank bank1 = new ICICBank();
		bank1.welcome();
		bank1.CreditCard();
		
		
		InterFaceChild ch1 = new InterFaceChild();
		
		ch1.payment();
		
		EncapsulationExample en = new EncapsulationExample();
		en.setName("Kiran");
		
		en.getName();
		System.out.println(en.getName());
		
		

	}

}
