
public class Doggo {

	public String dogComp(int a) {

		for (int i = 0; i <= 100; i++) {

			if (a == 11 || a == 12 || a == 13) {
				return a + "th";
			} else if (a % 10 == 3) {
				return a + "rd";
			} else if (a % 10 == 2) {
				return a + "nd";
			} else if (a % 10 == 1) {
				return a + "st";
			}
			return (a + "th");

		}
		return null;
	}
}