import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {

	private Doggo place = new Doggo();

	@Test
	void testDogComp() {
		Assertions.assertEquals("23rd", this.place.dogComp(23));
	}

}
