package program_variable;

public class Program3 {
	
	//global variable only for declaration in class block
	static int i=100;
	
	public static void main(String args[]) {
		
		//local variable
		int a=20;
		System.out.println(a);
		a=30;
		System.out.println(a);
		System.out.println(i);
		
	}
}
