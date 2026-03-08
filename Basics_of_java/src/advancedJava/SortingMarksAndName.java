package advancedJava;

import java.util.Comparator;
import java.util.List;

class Student3{
	String name;
	int marks;
	
	public Student3(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
}

public class SortingMarksAndName {

	public static void main(String[] args) {
		List<Student3> students=List.of(
				new Student3("Alia",70),
				new Student3("Bob",33),
				new Student3("Aman",88),
				new Student3("Zoya",90)
		);
		
		List<Student3> passed=students.stream()
				.sorted(Comparator
						.comparingInt((Student3 s) -> s.marks)
								.thenComparing(s -> s.name)
								)
						.toList();
				
		System.out.println("No.of Students above 60(pass) : "+passed.size());
		
		for (Student3 s : passed) {
		    System.out.println(s.name);
		}
	}
}
