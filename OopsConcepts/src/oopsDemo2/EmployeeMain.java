package oopsDemo2;

import oopsDemo.Employee; //import.packagename.classname; 
//we should use import if we accessing class from diff package not diff project 
//cannot access / import class from diff project

public class EmployeeMain {

	public static void main(String[] args) {
		
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

	}

}
