package association;

public class Test {
	public static void main(String[] args) {
			
		Car c=new Car();
		c.setBrand("A");
		c.setPrice(2000000);
		
		System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		
		Engine e=c.getEngine();
		System.out.println(e);
		
		
		
	}
}
