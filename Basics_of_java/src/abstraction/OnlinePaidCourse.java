package abstraction;

public class OnlinePaidCourse extends OnlineCourse {
	double courseFee;
	
	OnlinePaidCourse(String courseName,double platformCharge,double courseFee){
		super(courseName,platformCharge);
		this.courseFee=courseFee+platformCharge;
	}
	
	public void coursePrice() {
		System.out.println("Course price = "+(courseFee));
	}
	
	public static void main(String[] args) {
		Course c2=new OnlinePaidCourse("DSA",20,5000);
		c2.courseInfo();
		c2.coursePrice();
	}
}
