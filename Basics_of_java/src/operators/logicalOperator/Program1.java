package operators.logicalOperator;

public class Program1 {


	public static void main(String args[]) {
		
		//Logical AND --> terminates on false value
		System.out.println(true && false && true);
		
		int a=5;
		System.out.println(a<10 && ++a>a);
		System.out.println(a);
	}
}
