package oopsDemo;

//Main class

public class EmployeeMain {

	//Main method 
	public static void main(String[] args) {
	
		//Object for class employee
		Employee emp = new Employee();
		
		emp.empid=01;
		emp.name="Jhon";
		emp.job="Tester";
		emp.display(); //calling display method in employee normal method( display() )
		
       Employee emp1 = new Employee();
		
		emp1.empid=02;
		emp1.name="David";
		emp1.job="Tester";
		emp1.display();
		
		//we can also call the methods from different packages of the same project 
		
	}

}
