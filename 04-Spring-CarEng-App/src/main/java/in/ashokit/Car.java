package in.ashokit;

public class Car {
	
	private IEngine engine;
	
	
	public Car() {
		System.out.println("Car :: 0-Constructor");
	}
	/*
	 * public Car(IEngine engine) { System.out.println("Car :: Param-Constructor");
	 * this.engine = engine; }
	 */
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	
	public void drive() {
		int status = engine.start();
		
		if(status >=1) {
			System.out.println("Journey is Started....");
		}else {
			System.out.println("Engine Problem...");
		}
	}

}
