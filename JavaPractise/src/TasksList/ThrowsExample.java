package TasksList;

import java.io.IOException;

public class ThrowsExample {

	void Age(int age)throws IOException{
		
		if(age>=18)
		throw new IOException("Allowed to vote and Exception handled");
		else System.out.println("Not allowed, Exception not handled");
	}
	
	public static void main(String args[]){
		ThrowsExample obj=new ThrowsExample();
		try{
		obj.Age(20);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
