package oopsDemo;

public class ClassAndMethod2 {
	
	//variables or attributes
	
	int empid;
	String empname;
	double empsal;
	
	// Normal method
	
	void display() {
		
		System.out.println("id is " + empid);
		System.out.println("Name of the employee is " + empname);
		System.out.println("Salary " + empsal);
		
		
	}
	
	//main method

	public static void main(String[] args) {
		
		//creating object of the class

		ClassAndMethod2 emp1 = new ClassAndMethod2();
		
		emp1.empid = 100;
		emp1.empname = "Akshaya";
		emp1.empsal = 50000.00;
		emp1.display();	 //printing using display method		
		
		//creating 2nd object
		
       ClassAndMethod2 emp2 = new ClassAndMethod2();
		
		emp2.empid = 101;
		emp2.empname = "Divya";
		emp2.empsal = 60000.00;
		//System.out.println(emp2.empid); //we can use this way to print the values as well
		emp2.display();
		
	}

}
