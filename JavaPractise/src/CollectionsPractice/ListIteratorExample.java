package CollectionsPractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	int id;
	String name, address, designation;
	long num;

	Employee(int id, String name, String address, String designation, long num) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.num = num;
	}
}

public class ListIteratorExample {
	public static void main(String args[]) {

		List<Employee> list = new ArrayList<Employee>();

		Employee emp = new Employee(1, "Venkat", "Chennai", "Product Support engineer", 741888);
		Employee emp1 = new Employee(1, "Srikanth", "Chennai", "Software Developer", 90424);
		Employee emp2 = new Employee(3, "Triven", "Vizaj", "Pramsutical", 98567);

		list.add(emp);
		list.add(emp1);
		list.add(emp2);

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee details = itr.next();
			System.out.println(details.id + " " + details.name + " " + " " + details.designation + " "
					+ details.address + " " + details.num);
		}

	}
}
