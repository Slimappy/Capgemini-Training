package abstraction;

public class OnlineCourse extends Course {
	double platformCharge;
	
	OnlineCourse(String courseName,double platformCharge){
		super(courseName);
		this.platformCharge=platformCharge;
	}
	
	public void coursePrice() {
		System.out.println("Course price = "+platformCharge);
	}
	
	public static void main(String[] args) {
		Course c1=new OnlineCourse("OOPS",20);
		c1.courseInfo();
		c1.coursePrice();
	}
}
