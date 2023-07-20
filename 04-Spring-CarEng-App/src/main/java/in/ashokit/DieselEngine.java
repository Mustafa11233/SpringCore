package in.ashokit;

public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("Diesel Engine :: Constructor....");
	}

	public int start() {
		//logic
		
		System.out.println("Diesel Engine started...");
		
		return 1;

	}

}
