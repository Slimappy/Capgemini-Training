package abstraction;

public class B extends A{
	
	/*
	 * 	testA()
		B implementation
		testA()
		B implementation
		testB method
	 */

	public void test() {
		System.out.println("B implementation");
	}
	public void testB() {
		System.out.println("testB method");
	}
	
	public static void main(String[] args) {
		A a=new B();		//Up-casting
		a.testA();
		a.test();
		//a.testB();		//CTE
		
		B b=(B) a;		//Down-casting
		b.testA();
		b.test();
		b.testB();
	}
}
