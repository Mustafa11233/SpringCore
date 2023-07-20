package in.ashokit;

public class UserDao  {
	
	//in init() method we can give any name
	public void init() {
		System.out.println("getting db connection...");
		
	}
	public void getData() {
		System.out.println("getting data  from db....");
	}
	//in destroy() method we can give any name
	public void destroy() {
		System.out.println("closing db connection....");
		
	}

}
