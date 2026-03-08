package abstraction;

public class CreditCard extends Payment {
	String creditCompany;
	
	public CreditCard(double amount,String creditCompany) {
		super(amount);
		this.creditCompany=creditCompany;
	}
	//override
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("Company : "+creditCompany);
	}
	//override
	public void makePayment() {
		//logic for payment
		System.out.println("Payment is done using credit card");
	}
	
	public static void main(String[] args) {
		Payment payment=new CreditCard(5000,"SBI");
		payment.paymentInfo();
		payment.makePayment();
	}
}
