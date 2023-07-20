package in.ashokit.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao implements InitializingBean{
	
	public void getData() {
		System.out.println("getting data from db....");
	}
	//@PreDestroy
	public void destroy() throws Exception {
		System.out.println("destroy method.....");
		
	}
	//@PostConstruct
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("get data from db ....");
		System.out.println("store data into redis....");
	}

}
