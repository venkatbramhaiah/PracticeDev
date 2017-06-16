package CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int age;
	String gendar; 
	
	Student(String s, int a,String ch){
		name=s;
		age=a;
		gendar=ch;
	}
}

public class UserDefineArrayList {
public static void main(String args[]){
	Student s1= new Student("Venkat", 24, "Male");
	Student s2= new Student("Anuradha", 30, "Fmale");
	Student s3= new Student("Srikant", 27, "Male");
	Student s4= new Student("VenkateswraRao", 21, "Male");
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	
	Iterator<Student> itr= al.iterator();
	while(itr.hasNext()){
		Student st=(Student)itr.next();
		System.out.println(st.name+" "+st.age+" "+st.gendar);
	}
}
}
