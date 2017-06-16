package CollectionsPractice;

import java.util.Hashtable;
import java.util.Map;

class HashTableEx{
int id, sal;
String name, role;

public HashTableEx(int id, String name, String role, int sal){
	this.id=id;
	this.name=name;
	this.role=role;
	this.sal=sal;
}
}
public class HashTableExample2 {
public static void main(String args[]){
	Hashtable<Integer, HashTableEx> ht2= new Hashtable<Integer, HashTableEx>();

	HashTableEx data1=new HashTableEx(121, "Venkat", "Support Engineer", 15000);
	HashTableEx data2=new HashTableEx(122, "Srikanth", "S/W Developer", 78000);
	HashTableEx data3=new HashTableEx(123, "Venky", "Developer", 22000);
	
	
	ht2.put(11, data1);
	ht2.put(12, data2);
	ht2.put(13, data3);
	
	
	for(Map.Entry<Integer, HashTableEx> objx:ht2.entrySet()){
		int ids=objx.getKey();
		HashTableEx detais=objx.getValue();
		
		System.out.print(ids);
		System.out.println("\t"+detais.id+" "+detais.name+" "+detais.role+" "+detais.sal);
		
	}
}
}
