package in.ashokit.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("Credit Card Constructor...");
	}

	@Override
	public boolean processPayment(double billAmt) {
		//logic
		System.out.println("Credit Card Payment successfull.....");
		return true;
	}

}
