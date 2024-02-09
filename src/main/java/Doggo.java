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

		for (int i = 1; i <= 100; i++) {
			if (i == place) {
				continue;
			}
			String suffix = "";

			if (i == 11 || i == 12 || i == 13) {
				suffix = "th";
			} else if (i % 10 == 3) {
				suffix = "rd";
			} else if (i % 10 == 2) {
				suffix = "nd";
			} else if (i % 10 == 1) {
				suffix = "st";
			} else
				suffix = "th";

			placements.add(i + suffix);
		}

		return placements;
	}
}