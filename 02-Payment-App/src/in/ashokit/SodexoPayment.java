package in.ashokit;

public class SodexoPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmount) {
		//logic
		System.out.println("Sodexo Payment Processed...");
		return true;
	}

}
