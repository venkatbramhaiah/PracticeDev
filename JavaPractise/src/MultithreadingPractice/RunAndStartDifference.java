package MultithreadingPractice;

public class RunAndStartDifference extends Thread {
	public void run(){
		for(int i=0; i<5;i++){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.print(i);
		}
	}
	
	public static void main(String args[]){
		
		System.out.println("Run method output========");
		RunAndStartDifference obj1=new RunAndStartDifference();
		RunAndStartDifference obj2= new RunAndStartDifference();
		obj1.run();
		obj2.run();
		
		System.out.println("\n Start method output=============");
		
		RunAndStartDifference obj3= new RunAndStartDifference();
		RunAndStartDifference obj4= new RunAndStartDifference();
		obj3.start();
		obj4.start();
		
		
	}
}
