import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {

	private Doggo place = new Doggo();

	private Doggo doggo = new Doggo();

	@Test
	void testDogComp() {
		Assertions.assertEquals("23rd", this.place.dogComp(23));
	}

	@Test
	void testSize() {
		assertEquals(99, this.place.compete(42).size());
	}

	@Test
	void testContains() {
		assertEquals(false, this.doggo.compete(42).contains("42nd"));
	}

	@Test
	void testFirst() {
		assertEquals(true, this.doggo.compete(42).contains("21st"));
	}

	@Test
	void testSecond() {
		assertEquals(true, this.doggo.compete(42).contains("22nd"));
	}

	@Test
	void testThird() {
		assertEquals(true, this.doggo.compete(42).contains("23rd"));
	}

	@Test
	void testFourth() {
		assertEquals(true, this.doggo.compete(42).contains("24th"));
	}

	@Test
	void testEleven() {
		assertEquals(true, this.doggo.compete(42).contains("11th"));
	}

	@Test
	void testTwelve() {
		assertEquals(true, this.doggo.compete(42).contains("12th"));
	}

	@Test
	void testThirteen() {
		assertEquals(true, this.doggo.compete(42).contains("13th"));
	}

}
