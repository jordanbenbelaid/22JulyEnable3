
public class HelloWorld {

	//creating a static global variable, that can be accessed anywhere (in this class)
	public static int x = 20;

	public static void main(String[] args) {
//		System.out.println("Hello world!");

		// We stored the value "I am trainer Jordan" in the String variable message, and
		// then printed it to console
//		String message = "I am trainer Jordan";
//		System.out.println(message);

		messageOne();
		messageTwo("We are group 22JulyEnable3");
	}

	public static void messageOne() {
		String message = "I am trainer Jordan";
		System.out.println(message);
		//calls the global variable
		System.out.println(x);
		//re-initialise the variable to a different value, only for within this method
		int x = 3;
		System.out.println(x);
	}

	public static void messageTwo(String message) {
		System.out.println(message);
		//global variable value is still 20
		System.out.println(x);
	}

}
