package program_variable;

public class Program6 {

	public static void main(String args[]) {
		
		/*
		 * -128 -->0 -->127
		 * 128 = -128 (Cyclic)
		 * 129 = -127
		 */
		
		byte b=(byte) 129;
		System.out.println(b);
		
		int j=1_0_00;	//We can use underscore with numbers, no compile time error occurs, and normal value is printed
		System.out.println(j);
	}
}
