package in.ashokit;

public class App {
	public static void main(String[] args) {
		//Car c =new Car(new PetrolEngine());//Constructor Injection
		Car c=new Car();
		c.setEng(new DieselEngine());//Setter Injection
		c.drive();
	}

}
