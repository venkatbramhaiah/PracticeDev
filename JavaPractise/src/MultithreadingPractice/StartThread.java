package MultithreadingPractice;

public class StartThread extends Thread {
	public void run(){
		System.out.println("Thered is runnig.......");
	}
	
	public static void main(String args[]){
		StartThread obj= new StartThread();
		obj.start();
	}

}
