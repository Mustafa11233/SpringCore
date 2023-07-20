package in.ashokit;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int start() {
		System.out.println("PetrolEngine is Started...");
		return 1;
	}

}
