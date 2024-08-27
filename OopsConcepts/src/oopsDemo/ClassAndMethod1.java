package oopsDemo;

//class
public class ClassAndMethod1 {
	
	//Vriabels
	int num = 1;
	String name = "Akshaya";
	char initial = 'H';
	
	//normal method
	
	void display() {
		System.out.println(num + " " + name + " " + initial);
	}
	
	
	//main method
	
	public static void main(String[] args) {
		 
		//creating object for the class 
		//object always should be written in main method
		//inside one main method cannot take another method
		
		ClassAndMethod1 intro = new ClassAndMethod1();
		
		//calling method through an object by using '.'
		
		System.out.println(intro.num);
		System.out.println(intro.name);
		System.out.println(intro.initial);
				

	}

}
