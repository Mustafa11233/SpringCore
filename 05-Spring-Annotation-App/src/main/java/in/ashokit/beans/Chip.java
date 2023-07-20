package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		System.out.println("Chip :: 0-Constructor");
	}
	
	public String chipType() {
		return "32-Bit";
	}

}
