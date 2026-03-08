package advancedJava;

import java.util.List;

class Student{
	String name;
	int marks;
	
	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}

public class StudentsPassed {

	public static void main(String[] args) {
		List<Student> students=List.of(
				new Student("A",22),
				new Student("B",33),
				new Student("K",88),
				new Student("Z",90)
		);
		
		List<Student> passed=students.stream()
				.filter(s -> s.marks > 60)								//not transform or mutate
				.peek(s -> System.out.println("Passed : "+s.name))		//for debugging
				.peek(s -> s.setMarks(s.marks*2)) 						//mutating
				.map(s -> new Student(s.name,s.marks*2)) 				//transform
				.peek(System.out::println)
				.toList();
		
		System.out.println("No.of Students above 60(pass) : "+passed.size());
		
		for (Student s : passed) {
		    System.out.println(s.name+ "'s marks: " +s.marks);
		}

	}
}
