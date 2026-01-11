package methods;

public class Program1 {
	
	public static void demo() {		//Non-parameterized method
		System.out.println("demo");
	}
	
	public static void test(int a) {	//Parameterized method
		System.out.println(a);
	}
	public static void main(String args[]) {
		
		demo();
		test(10);
		
	}
}