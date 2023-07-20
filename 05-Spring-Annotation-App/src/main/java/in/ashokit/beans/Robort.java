package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robort {
	
	public Robort() {
		System.out.println("Robert :: 0-constructor");
	}
	@Autowired
	private Chip chip;
	
	public void doWork() {
		String type = chip.chipType();
		
		if(type.equals("32-Bit")) {
			System.out.println("Performance is slow..");
		}
		
	}

}
