package array;

public class Program6 {
	
	public static void main(String[] args) {
		
		//Design a method to create a array of employee and return the array;
		
		Employee[] employee=new Employee[3];
		employee[0]=new Employee(1,"Adam",200000);
		employee[1]=new Employee(2,"Lewis",400000);
		employee[2]=new Employee(3,"Virat",600000);
		
		for(int i=0;i<employee.length;i++) {
			employee[i].display();
//			System.out.println(employee[i].display());
			
		}
		
	}
}

