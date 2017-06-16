package CollectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

class Address{
	Address(){}
	String State;
	String Dist;
	int pincode;
	Address(String state, String dist, int pin){
		this.State=state;
		this.Dist=dist;
		this.pincode=pin;
	}
}
class Customer extends Address implements Comparable<Customer>{ 
	String name;
	long phone;
	String email;
	Address add;
	
	
	Customer(String name, long phone,String email, Address Add){
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.add=Add;
		
	}
	   public String toString() {
	        return ("StudentName : "+this.name+
	                    " Email: "+ this.email +
	                    " Phone: "+ this.phone +
	                    " State : "+ this.add.State +
	                    " Distace : "+this.add.Dist+
	                    " Pincode : "+this.add.pincode) ;
	   }
	@Override
	public int compareTo(Customer o) {
		return this.name.compareTo(o.name);
	}
}


public class CustomerDetails {  
//extends Customer{
//          CustomerDetails(String name, long phone, String email, Address Add) {
//		super(name, phone, email, Add);
//	 }

public static void main(String args[]){
	
	ArrayList<Customer> al=new ArrayList<>();
	Address add1= new Address("Tamilnadu","Kanchipuram",600097);
	Address add2= new Address("Andhra Pradesh","Guntur",522408);
	Address add3= new Address("Prakasam","Ongole",522789);
	Address add4= new Address("EastGodavari","Bhemavaram",546789);
	
	Customer cust1= new Customer("Venkat",7418885148L,"venkat.bramhaiah@a-cti.com",add1);
	Customer cust2= new Customer("Srikanth",9042413551L,"srikanthgadde1987@gmail.com",add2);
	Customer cust3= new Customer("Susmitha",8106705997L,"susmitha.srinivasulu@gmail.com",add3);
	Customer cust4= new Customer("Revathi",8019542369L,"revathi.venkat@full.io",add4);
	
	al.add(cust1);
	al.add(cust2);
	al.add(cust3);
	al.add(cust4);
     
	Collections.sort(al);
	
	System.out.println(al);
 
	
	java.util.Iterator<Customer> ir = al.iterator();
	while(ir.hasNext()){
	System.out.println(ir.next());
	System.out.println("============");
	}
	
}


}
