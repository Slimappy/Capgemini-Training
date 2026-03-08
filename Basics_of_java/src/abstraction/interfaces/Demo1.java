package abstraction.interfaces;

public class Demo1 implements I1 {

	public void testA() {
		System.out.println("Demo testA()");
	}
	public void testB() {
		System.out.println("Demo testB()");
	}
	public void testC() {
		System.out.println("Demo testC()");
	}
	
	public static void main(String[] args) {
		//I1 i1=new I1();		//CTE
		
		I1 i2=new Demo1();
		i2.testA();
		i2.testB();
		//i2.testC();	//CTE
	}
}
