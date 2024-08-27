package oopsDemo;

public class Employee {
	
	//variable
	
	public int empid;
	public String name;
	public String job;
	
	//Normal method
	
	public void display() {    
		//an method should atleast have an return type
		//Access modifier should be provide correctly in order to access from different packages and classes
		System.out.println(empid);
		System.out.println(name);
		System.out.println(job);
	}
}
//main method can be in another class (employeeMain)
