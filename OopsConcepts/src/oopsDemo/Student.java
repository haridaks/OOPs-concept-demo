package oopsDemo;

public class Student {

	//class variables //global variables
	//used for multiple methods 
	String schoolname = "St'Mary's";
	int sid;
	String sname;
	int smark;
	
	void printData() {
		
		System.out.println(schoolname);
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(smark);
	}
	
	//we create method with local variables like this 
	//this variables can be used only within this method
	void setstudentdata(int id, String name, int mark ) {
		 sid = id; //storing the local variables in the class variables
		 sname = name;
		 smark = mark;
	}
	
	//constructor
	Student((int id, String name, int mark )) {
		 sid = id; //storing the local variables in the class variables
		 sname = name;
		 smark = mark;{
		
		
		
		
	}
}


