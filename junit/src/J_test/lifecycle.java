package J_test;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
interface lifecycle {
	
	@BeforeAll
	default void beforeAllTest() {
		System.out.println("WELCOME");
	}
	
	@AfterAll
	default void afterAllTest() {
		System.out.println("THANK YOU");
	}

}
