package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.AppConfig;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new  AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService service = context.getBean(ReportService.class);
		
		service.generateReport();
	}

}