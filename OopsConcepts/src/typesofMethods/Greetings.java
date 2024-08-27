package typesofMethods;

public class Greetings {

  //1) No params   no return value
	
	void m1(){
		System.out.println("Hello..");
	}
   
	//1) No params   return value
	
	String m2() {
		return ("Akshaya..");
		
	}
	
	//3) Takes Params   no return value
	
	void m3(String time) {
		
		System.out.println(time);
		
	}
	
	//4) Takes params Takes return value
	
	String m4(String message) {
		
		return (message);
				
	}
	
}