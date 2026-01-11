package program_variable;

public class Program5 {
	
	public static void main(String args[]) {
		
		//Type-casting --> implicit(widening) and explicit(narrowing)
		
		char c='z';
		int i=c;
		
		System.out.println(i);
		
		int j=65;
		char ch=(char)j;
		
		System.out.println(ch);
	}
}
