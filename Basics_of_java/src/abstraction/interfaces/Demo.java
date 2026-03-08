package abstraction.interfaces;

public class Demo implements I2,I3 {

	public static void main(String[] args) {
		System.out.println(I3.a);		//direct accesses not allowed --> access with Interface name as reference
		I2.m();
	}
}
