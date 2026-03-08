package Assignments;

public class CheckValidMailId {

	//valid --> hari.hp000@gmail.com
	//invalid -->.hari
	//. _ are acceptable
	
	// "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"; -->Actual
	public static void checkEmail(String str) {
		
		boolean res=str.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}");
		if(res==true) {
			System.out.println(str+" Is A Valid Email Id");
		}
		else
			System.out.println(str+" Is NOT A Valid Email Id");
	}
	
	public static void main(String[] args) {
		
		String str="walking.ded@gmail.com";
		checkEmail(str);
		
	}
}
