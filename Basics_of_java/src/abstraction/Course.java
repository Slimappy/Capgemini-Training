package abstraction;

public abstract class Course {

	String courseName;
	public abstract void coursePrice();
	
	Course(String course){
		this.courseName=course;
	}
	public void courseInfo() {
		System.out.println("Course name : "+courseName);
	}
}
