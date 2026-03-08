package advancedJava;

import java.util.List;

class Student5{

	 int  id;
	 String name;
	 int age;
	
	public Student5(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}

public class Assigment {

	public static void main(String[] args) {
		
		List<Student5> students=List.of(
				new Student5("Ram",20),
				new Student5("Hari",17),
				new Student5("Sita",25)
		);
		
		//Get all names
		System.out.println("Names: ");
		students.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		//Count Adults
		long count= students.stream()
				.filter(s->s.getAge()>18)
				.count();
		System.out.println("No.of Adults : "+count);
		
		//DoubleAge
		List <Student5> doubleAge = students.stream()
				.filter(s-> s.getAge()>=18 && s.getAge()<=40)
				.map(s -> new Student5(s.name,s.age*2))
				.peek(s ->System.out.println(s.getAge()))
				.toList();
		
		

	}
}
