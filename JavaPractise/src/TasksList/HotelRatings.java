package TasksList;

import java.util.ArrayList;
import java.util.Collections;

class Hotels implements Comparable<Hotels> {
	String name;
	double rating;
	int cost;

	Hotels(String name, double rating, int cost) {
		this.name = name;
		this.rating = rating;
		this.cost = cost;
	}

	@Override
	public int compareTo(Hotels o) {
		if (this.cost == o.cost && this.rating == o.rating)
			return 0;
		else if (this.cost > o.cost && this.rating < o.rating)
			return 1;
		else
			return -1;
	}

}

public class HotelRatings {
	public static void main(String args[]) {

		ArrayList<Hotels> al = new ArrayList<Hotels>();
		al.add(new Hotels("Nakshatra", 4.1, 500));
		al.add(new Hotels("Geetha", 5, 1000));
		al.add(new Hotels("Mayuri", 4.5, 300));
		al.add(new Hotels("Mourya", 3.3, 350));
		al.add(new Hotels("Sankar Vilas", 2.5, 400));
		Collections.sort(al);
		for (Hotels htl : al) {
			System.out.println("The lowest cost with High rating is: " + "Name:" + htl.name + "Rating " + htl.rating+ " Cost: " + htl.cost);
		}
	}
}
