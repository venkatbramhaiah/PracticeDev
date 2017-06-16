package CollectionsPractice;

import java.util.LinkedList;

class Book{
	String name, author, published;
	int quantity;
	Book(String name,String author, String published,int quantity){
		this.author=author;
		this.name=name;
		this.published=published;
		this.quantity=quantity;
	}
}

public class UserDefineLinkedList {
public static void main(String args[]){
	
	LinkedList<Book> ll=new LinkedList<Book>();
	Book obj=new Book("One","Venkat","Acadamy",1);
	Book obj1=new Book("Java","Srikanth", "Acadamy",2);
	Book obj2=new Book("CvilEngg", "VenakteswraRao","Deepthi",1);

	ll.add(obj);
	ll.add(obj1);
	ll.add(obj2);
	
	for(Book book:ll){
		System.out.println(book.name+" "+book.author+" "+book.published+" "+book.quantity);
	}
}
}
