import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Test_unit2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
