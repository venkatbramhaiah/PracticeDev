package CollectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExampleOne {
	public static void main(String args[]){
		Map<Integer, String> mp= new HashMap<Integer, String>();
		mp.put(1, "Venkat");
		mp.put(2, "Srikanth");
		mp.put(3, "Venky");
	
		
		for(Map.Entry m:mp.entrySet()){
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
		System.out.println(mp.get(2));
		mp.remove(4);
		mp.put(4, "Anuradha");
		
		Set set= mp.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry entry= (Map.Entry)itr.next();
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
	}

}
