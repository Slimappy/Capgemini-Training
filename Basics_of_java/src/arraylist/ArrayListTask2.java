package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask2 {

	public static ArrayList<Student> getFailedStudents(ArrayList<Student> data){
		
		ArrayList <Student> failed=new ArrayList<Student>();
		
		for(Student s:data) {
			if(s.percentage<40) {
				failed.add(s);
			}
		}
		return failed;
	}
	
	public static void main(String[] args) {
		ArrayList <Student> students=new ArrayList<Student>();
		students.add(new Student(1,"Ravi",80.0));
		students.add(new Student(2,"Pratik",60.0));
		students.add(new Student(3,"Ravi",30.0));
		students.add(new Student(4,"Sham",10.0));
		students.add(new Student(5,"Sonu",65.0));
		
		Iterator<Student> itr=students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("==================================");
		
		System.out.println("Failed Students : "+getFailedStudents(students));
	}
}
