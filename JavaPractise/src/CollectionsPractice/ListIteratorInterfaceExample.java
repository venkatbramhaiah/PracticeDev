package CollectionsPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInterfaceExample {
public static void main(String args[]){
	ArrayList<String> al=new ArrayList<String>();
	al.add("Venkat");
	al.add("Srikanth");
	al.add("Anuradha");
	al.add("Venky");
	
	al.add(2,"AnushaSrikanth");
	
	System.out.println("The element in the third position is: "+al.get(1));
	
	
	ListIterator<String> itr=al.listIterator();
	
	System.out.println("Forward Direction==========\n");
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("Backword Directions==========\n");
	while(itr.hasPrevious()){
		System.out.println(itr.previous());
	}
}
}
