package J_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class first_test {
	
	@Test
	void add() {
		
		int input=1+1;
		int output=2;
		System.out.println("this is the first unit program\n");
		assertEquals(input,output);
		
	}
	
	
	@Disabled
	@Test
	void sub() {
		
		int input=4-2;
		int output=5;
		System.out.println("this is second unit program\n");
		assertEquals(input,output);
	}
	
	@Test
	void mul() {
		
		int input=3*3;
		int output=9;
		System.out.println("this is third unit of program\n");
		assertEquals(input,output);
	}
	
	
}
