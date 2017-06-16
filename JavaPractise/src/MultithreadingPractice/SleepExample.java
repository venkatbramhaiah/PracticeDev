package MultithreadingPractice;

public class SleepExample extends Thread {

	public void run(){
		for(int i=0; i<5; i++){
		try{
		Thread.sleep(500);	
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(i);
	}
	}
		public static void main(String args[]){
			SleepExample se= new SleepExample();
			SleepExample se1= new SleepExample();
			se.start();
			se1.start();
	}
}
