package CollectionsPractice;

import java.util.Hashtable;
import java.util.Map.Entry;


public class HashTableExample {
public static void main(String args[]){
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(3, "Venkat");
	ht.put(2, "Srikanth");
	ht.put(1, "Anuradha");
	ht.put(4, "venky");

	for(Entry<Integer, String> entry:ht.entrySet()){
		System.out.println(entry.getKey()+" "+entry.getValue());
		
	}

}
}
