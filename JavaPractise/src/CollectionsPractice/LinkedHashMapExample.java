package CollectionsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

class Employer{
	int id, sal;
	String name, role;
	
	public Employer(int id, String name, String role, int sal){
		this.id= id;
		this.name=name;
		this.role=role;
		this.sal=sal;
	}
}

public class LinkedHashMapExample {
	public static void main(String args[]){
		Map<Integer, Employer> lhm= new LinkedHashMap<Integer, Employer>();
		Employer e1=new Employer(1234, "Venkat", "Dev Support", 15000);
		Employer e2= new Employer(1235, "Srikanth", "S/W Dev", 78000);
		Employer e3=new Employer(1236,"Venkateswrao","Dev",22000);
		lhm.put(1, e1);
		lhm.put(2, e2);
		lhm.put(3, e3);
		
		for(Map.Entry<Integer, Employer>  map:lhm.entrySet()){
			int key= map.getKey();
			Employer emp=map.getValue();
			System.out.print(key);
			System.out.println("\t"+emp.id+" "+emp.name+" "+emp.role+" "+emp.sal);
		}
		
	}

}
