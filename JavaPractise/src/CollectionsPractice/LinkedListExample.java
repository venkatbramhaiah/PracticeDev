package CollectionsPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
public static void main(String args[]){
//Creating LinkedList.
	LinkedList<String> ll= new LinkedList<String>();
	
// Adding elements to the LinkedList	
	ll.add("Venakt");
	ll.add("Srikant");
	ll.add("Anuradha");
	ll.add("VenkateswraRao");
	
//Adding element to the list based on the index.	
	ll.add(2, "Dhini");
	
// Adding the element to the first position in list 	
	ll.addFirst("Varshith");
	
//Adding element in last position in list.
	ll.addLast("Sujith");
	
// Traversing the elements from list	
	Iterator<String> itr=ll.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}
}
