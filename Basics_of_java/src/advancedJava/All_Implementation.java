package advancedJava;

import java.util.List;
import java.util.Optional;

class Student4{

	private int  id;
	private String name;
	private int age;
	
	public Student4(int id, String name, int age) {
		this.id = id;
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

}
public class All_Implementation {

	public static void main(String[] args) {
		List<Student4> students=List.of(
				new Student4(1,"Hari",20),
				new Student4(2,"Kumar",17)
		);
		
		//toList()
		List <Student4> adults =students.stream()
				.filter(s->s.getAge()>18)
				.toList();
		
		System.out.println(adults);
		
		
		//for Each()
		students.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		//count()
		long count= students.stream()
				.filter(s->s.getAge()>18)
				.count();
		System.out.println(count);
		
		//findFirst()
		Optional<Student4> first=students.stream()
				.filter(s->s.getAge()>18)
				.findFirst();
		
		//anyMatch()
		boolean anyMinor=students.stream()
				.anyMatch(s ->s.getAge()<18);
		
		//allMatch()
		boolean allAdults=students.stream()
				.allMatch(s->s.getAge()>18);
		
		//noneMatch()
		boolean noneSenior=students.stream()
				.noneMatch(s->s.getAge()>60);
		
		//reduce()
		int totalAge=students.stream()
				.map(s->s.getAge())
//				.map(Student4::getAge)
//				.reduce(0,Integer::sum);	
				.reduce(0, (a,b) -> a+b);
		System.out.println(totalAge);
		
	}
}
