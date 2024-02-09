import java.util.ArrayList;
import java.util.List;

public class Doggo {

	public String dogComp(int a) {

		for (int i = 1; i <= 100;) {

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

	public List<String> compete(int place) {
		List<String> placements = new ArrayList<>();

		int lastDigit = -1;
		String suffix = "";

		for (int i = 1; i <= 100; i++) {
			if (i == place) {
				continue;
			}
			lastDigit = i % 10;

			// modulus i by 100 if you want to go over 1,000
			if (lastDigit == 1 && i != 11) {
				suffix = "st";
			} else if (lastDigit == 2 && i != 12) {
				suffix = "nd";
			} else if (lastDigit == 3 && i != 13) {
				suffix = "rd";
			} else {
				suffix = "th";
			}

			placements.add(i + suffix);
		}

		return placements;
	}
}