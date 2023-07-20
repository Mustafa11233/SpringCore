package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)  {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		UserDao dao = context.getBean(UserDao.class);
		
		dao.getData();
		
	ConfigurableApplicationContext	 cctxt=
			(ConfigurableApplicationContext)context;
	//closing my Application Context(IOC Container)
	//it will remove all the objects available in IOC Container
	//then destroy method will execute
	cctxt.close();
	}

}
