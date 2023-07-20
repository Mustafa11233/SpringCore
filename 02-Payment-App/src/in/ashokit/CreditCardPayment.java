package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmount) {
		//logic
		System.out.println("Credit Card Payment Processed...");
		return true;
	}

}
