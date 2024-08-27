package oopsDemo;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		//stu1.schoolname; //no need to call this variable since the value is already declared and same for all the objects
		//so it automatically gets student value from, student class
		//using object reference
		
		/*stu1.id = 01;
		stu1.name = "Akshaya";
		stu1.mark = 90;
		stu1.printData(); */
		
		//using the local variables in normal class
		//using method
		stu1.setstudentdata(02,"Jhon", 90);
		stu1.printData();

		//using constructor
		
		

}
}
