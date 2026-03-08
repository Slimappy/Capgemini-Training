package arraylist;

import java.util.ArrayList;

public class Student {

	String name;
	int id;
	double percentage;
	
	Student(int id,String name,double percentage){
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	

	public String toString() {
		return "Student { Id : "+id+ ", Name :"+name+ ", Percentage : "+percentage +"}";
	}
	
}
