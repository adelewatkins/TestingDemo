import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	void testAdd() {
		Assertions.assertEquals(8, this.calc.add(4, 4));
	}

	@Test
	void testSubtract() {
		Assertions.assertEquals(10, this.calc.subtract(20, 10));
	}

	@Test
	void testDivide() {
		Assertions.assertEquals(3.33, this.calc.divide(10, 3, 0.5));
	}

	@Test
	void testTimes() {
		Assertions.assertEquals(10, this.calc.times(5, 2));
	}

}
