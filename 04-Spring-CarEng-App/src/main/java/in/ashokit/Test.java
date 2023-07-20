package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test { 
	public static void main(String[] args) {
		//at the time of starting only objects is creating by IOC
		ApplicationContext context =
				new ClassPathXmlApplicationContext("Beans.xml");
		
		Car c1 = context.getBean(Car.class);
		c1.drive();
		System.out.println(c1.hashCode());
		
		 Car c2 = context.getBean(Car.class);
		 System.out.println(c2.hashCode());
		 
		 Car c3 = context.getBean(Car.class);
		 System.out.println(c3.hashCode());
		
	}

}
