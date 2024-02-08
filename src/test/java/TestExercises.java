import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExercises {

	private TestingExercises fact = new TestingExercises();

	@Test
	void testFactorial() {
		Assertions.assertEquals(120, this.fact.factorial(5));
	}

	@Test
	void testRevFactorial150() {
		Assertions.assertEquals("NONE", this.fact.revFactorial(150));
	}

	@Test
	void testRevFactorial120() {
		Assertions.assertEquals("5!", this.fact.revFactorial(120));
	}

}
