package typesofMethods;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings gr = new Greetings();
		
		//1
		gr.m1();
		
		//2
		String s = gr.m2();
		System.out.println(s);
		
		//3
		gr.m3("GoodMorning...");
		
		//4
		String s1 = gr.m4 ("Have a great day..");
		System.out.println(s1);
		
		/*gr.m4("Have a great day..");
		System.out.println(gr.m4("Have a great day.."));*/
		
	}

}
