import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	// Test case for the method factorOfZero that came from main.
	@Test
	void factorialOfZero() {
		Factorial zero = new Factorial();
		assertEquals(1, zero.factorialOfZero(0));
	}
}
