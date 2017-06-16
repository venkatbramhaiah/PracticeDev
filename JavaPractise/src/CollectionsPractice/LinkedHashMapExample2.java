package CollectionsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample2 {
public static void main(String args[]){
	Map<Integer, String> lhm= new LinkedHashMap<Integer, String>();
	lhm.put(1, "Venkat Naveen");
	lhm.put(2, "Srikanth gadde");
	lhm.put(3, "Venkateswra Rao");
	lhm.put(4, "Anuradha Gude");
	
	
	System.out.println("Married and Batchler list  "+lhm);
	lhm.remove(4);
	System.out.println("Batchler list "+lhm);
}
}
