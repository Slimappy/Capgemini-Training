package advancedJava;

import java.util.List;

class Student2{
	String name;
	int marks;
	int age;
	
	public Student2(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
}

public class Filter_Marks_Name {

	public static void main(String[] args) {
		List<Student2> students=List.of(
				new Student2("A",70),
				new Student2("B",33),
				new Student2("K",88),
				new Student2("Z",90)
		);
		
		List<Student2> passed=students.stream()
				.filter(s -> s.marks > 60)
				.filter(s->s.name.startsWith("A"))
				.toList();
		
		System.out.println("No.of Students above 60(pass) : "+passed.size());
		
		for (Student2 s : passed) {
		    System.out.println("Student's Name : " + s.name);
		}

	}
}


