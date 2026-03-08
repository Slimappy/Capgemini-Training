package advancedJava;

import java.util.List;

class Student1{
	String name;
	int marks;
	int age;
	
	public Student1(String name,int marks,int age) {
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
}

public class StudentsAge {

	public static void main(String[] args) {
		List<Student1> students=List.of(
				new Student1("A",22,19),
				new Student1("B",33,30),
				new Student1("K",88,20),
				new Student1("Z",90,17)
		);
		
		List<Student1> passed=students.stream()
				.filter(s -> s.marks > 60 && s.age > 18)
				.toList();
		
		System.out.println("No.of Students above 60(pass) : "+passed.size());
		
		for (Student1 s : passed) {
		    System.out.println(s.name);
		}

	}
}

