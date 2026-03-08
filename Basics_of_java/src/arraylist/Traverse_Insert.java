package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_Insert {

public static void main(String[] args) {
		
		ArrayList<String> languages=new ArrayList<String>();
		languages.add("JAVA");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
		
//		for each -> traverse + insert(not possible) we get concurrentException
//		for(String s:languages) {
//			if(s.equals("Python")) {
//				languages.add("Ruby");
//			}
//		}
		
//		System.out.println(languages);
		
//		iterator -> traverse+insert(not possible)
//		Iterator<String> itr=languages.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().equals("Python")) {
//				languages.add("Ruby");
//			}
//		}
//		System.out.println(languages);
//		
		
//		listiterator -> traverse + insert(possible) 
		ListIterator<String> itr2=languages.listIterator();
		System.out.println(languages);
		while(itr2.hasNext()) {
			if(itr2.next().equals("Python")) {
				itr2.add("Ruby");
			}
		}
		System.out.println(languages);
		
}
}
