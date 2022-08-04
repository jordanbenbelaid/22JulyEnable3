
public class DataTypesReturns {

	public static void main(String[] args) {
//		methodOne();
//		System.out.println(methodTwo());	
		
		System.out.print("Hello");
		System.out.println("World");
		System.out.print("It's");
		System.out.println("Me!");
	}

	//void is a method with no return (i.e nothing is RETURNED in this method, but it does print something)
	public static void methodOne() {
		System.out.println("This is method 1");
	}
	
	
	//Return type methods return a value to us, but DOES NOT print it to the console right away
	public static String methodTwo() {
		return "This is method 2, I am better than method 1";		
	}
}
