package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;


class Test{
	int id, cost;
	String name, published;
	public Test(int id , String name, String published, int cost){
		this.id=id;
		this.name=name;
		this.published=published;
		this.cost=cost;
	}
	
	
}
public class HashMapExample {
public static void main(String args[]){
	Map<Integer, Test> hm= new HashMap<Integer, Test>(); 
	Test t1=new Test(121, "Attitude", "Venkat", 300);
	Test t2= new Test(122, "Personal","Venakteswrarao",400);
	Test t3= new Test(123, "Develop", "srtikanth", 500);
	
	hm.put(1, t1);
	hm.put(2,t2);
	hm.put(3, t3);
	
	
	for(Map.Entry<Integer, Test > mphm:hm.entrySet()){
		int key=mphm.getKey();
		Test test=mphm.getValue();
		System.out.println(key);
		System.out.println(test.id+" "+test.name+" "+test.published+" "+test.cost);
		//System.out.println(mphm.getKey()+" "+mphm.getValue());
	}
}
}
