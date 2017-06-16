package CollectionsPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		Map<Integer, String> tm= new TreeMap<Integer, String>();
		tm.put(1, "Venkat");
		tm.put(2, "Srikanth");
		tm.put(4, "Venkateswra Rao");
		tm.put(3, "Anuradha");
		
		for(Map.Entry<Integer,String> tmd:tm.entrySet()){
			System.out.println(tmd.getKey()+" "+tmd.getValue());
		 
		}
		
	}

}
