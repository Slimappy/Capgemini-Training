package advancedJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
//		List<Integer> even = new ArrayList<>();
//		for(Integer n:list) {
//			if(n%2==0) {
//				even.add(n);
//			}
//		}
		
		List <Integer> even = list.stream()					//source
								.filter(n -> n%2 ==0)		//intermediate-1 (getting even numbers)
								.map(n->n*2)				//intermediate-2 (multiplying those by 2)
								.toList();					//collect
		
		System.out.println(even);
	}
}

//Collection > Stream > Filter > Transform > Collect > Result
