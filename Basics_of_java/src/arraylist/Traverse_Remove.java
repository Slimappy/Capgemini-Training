package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_Remove {

	public static void main(String[] args) {
		
		ArrayList<String> languages=new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
		//for each -> only traverse forward, remove(not possible) we get ConcurrentException
//		for(String s:languages) {
//			if(s.equals("Python")) {
//				languages.remove(s);
//			}
//		}
		
//		System.out.println("=================================================");
		
		//Iterator -> only traverse forward + remove(possible)
		
//		Iterator <String> itr=languages.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		while(itr.hasNext()) {
//			
//			if(itr.next().equals("Python")) {
//				itr.remove();
//			}
//			System.out.println(languages);
//		}
//		
//		System.out.println("===================================================");
		
		//ListIterator -> traverse forward & backward + remove(possible)
		ListIterator<String> itr2=languages.listIterator();
		System.out.println(languages);
		
		
		while(itr2.hasNext()) {
			if(itr2.next().equals("Python"))
				itr2.remove();
		}
		System.out.println(languages);
//		System.out.println("===================================================");
//		while(itr2.hasPrevious()) {
//			System.out.println(itr2.previous());
//		}
	}
}

