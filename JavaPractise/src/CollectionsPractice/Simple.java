package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Teachers {
	int rollno;
	String name;
	int age;

	Teachers(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Teachers> {
	public int compare(Teachers s1, Teachers s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Teachers> {
	public int compare(Teachers s1, Teachers s2) {
		return s1.name.compareTo(s2.name);
	}
}

class Simple {
	public static void main(String args[]) {

		ArrayList<Teachers> al = new ArrayList<Teachers>();
		al.add(new Teachers(101, "Vijay", 23));
		al.add(new Teachers(106, "Ajay", 27));
		al.add(new Teachers(105, "Jai", 21));

		System.out.println("Sorting by Name...");

		Collections.sort(al, new NameComparator());
		for (Teachers st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		for (Teachers st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
