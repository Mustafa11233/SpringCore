package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	public ReportService() {
		System.out.println("ReportService :: constructor");
	}
	
	//Qualifier is used to identify the bean based on given name for DI
	
	/*
	 * @Autowired
	 *
	 * @Qualifier("MySQLDao") private ReportDao reportDao;
	 */
	private ReportDao dao;
	
//	@Autowired
//	public void setDao(ReportDao dao) {
//		
//		System.out.println("Setter Method called...");
//		this.dao = dao;
//		
//	}
	
	//when u have more then one constructor ,we need to specify @Autowired annotation
	//if we have only one constructor,@Autowired annotation is optional.
	@Autowired
	public ReportService(ReportDao dao) {
		System.out.println("ReportService :: Param-Constructor..");
		this.dao = dao;
	}
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated...");
	}

}
