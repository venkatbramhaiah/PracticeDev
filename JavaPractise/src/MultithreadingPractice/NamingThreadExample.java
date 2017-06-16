package MultithreadingPractice;

public class NamingThreadExample extends Thread  {
public void run(){
	System.out.println("Thread is running...........");
}

public void main(String args[]){
	NamingThreadExample obj= new NamingThreadExample();
	NamingThreadExample obj1= new NamingThreadExample();
	System.out.println("Name of the thread is "+obj1.getName());

	obj1.start();
	obj.start();

 obj1.setName("Venkat");
 System.out.println("Name of the changed thread is "+obj1.getName());
}
	
}
