package in.ashokit.beans;

public class DebitCardPayment implements IPayment {
	
	
	public DebitCardPayment() {
		System.out.println("Debit Card Constructor...");
	}

	@Override
	public boolean processPayment(double billAmt) {
		
		//logic
		System.out.println("DebitCard Payment successfull....");
		return true;
	}

}
