package in.ashokit;

public class Car {
	 IEngine eng ;//Field Injection
	/*
	public Car(IEngine eng) {
		this.eng=eng;
	}
	*/
	public void setEng(IEngine eng) {
		this.eng  =eng;
	}
	public void drive() {
		//Engine eag =new Engine();//HAS-A Relation
		int status = eng.start();
		
		//int status = super.start();
		if(status >=1) {
			System.out.println("Journey Started...");
		}else {
			System.out.println("Engine problem...");
		}
		//logic
	}

}
