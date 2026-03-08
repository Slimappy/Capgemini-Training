package abstraction;

public class UPIPayment extends Payment {
	String upiPlatform;
	
	public UPIPayment(double amount,String upiPlatform) {
		super(amount);
		this.upiPlatform=upiPlatform;
	}
	//override
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("Platform : "+upiPlatform);
	}
	//override
	public void makePayment() {
		//logic for payment
		System.out.println("Payment is done using UPI");
	}
	
	public static void main(String[] args) {
		Payment payment=new UPIPayment(5000,"Gpay");
		payment.paymentInfo();
		payment.makePayment();
	}
}