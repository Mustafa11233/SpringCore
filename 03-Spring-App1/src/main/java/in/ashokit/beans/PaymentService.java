package in.ashokit.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService() {
		System.out.println("Payment Service :: 0-Constructor..");
	}
	
	public PaymentService(IPayment payment) {
		
		System.out.println("Payment Service :: Param-Constructor");
		
		this.payment=payment;
	}
	
	public void setPayment(IPayment payment) {
		System.out.println("setter method is called...");
		this.payment = payment;
	}
	
	public void doPayment(double billAmt) {
		
		boolean status = payment.processPayment(billAmt);
		
		if(status) {
			System.out.println("Recipt Printing....");
		}else {
			System.out.println("card Declined...");
		}
		
	}

}
