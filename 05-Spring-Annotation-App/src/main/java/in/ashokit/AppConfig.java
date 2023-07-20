package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.tcs","in.ashokit"})
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: 0-constructor");
	}
	
	@Bean
	public Engine getEngine() {
		Engine eng = new Engine();
		//logic
		return eng;
		
	}

}
