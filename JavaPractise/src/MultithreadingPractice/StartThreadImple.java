package MultithreadingPractice;

public class StartThreadImple implements Runnable{
public void run(){
	System.out.println("Runnig the implemented thread..........");
}

public static void main(String args[]){
	StartThreadImple obj=new StartThreadImple();
	Thread tr= new Thread(obj);
	tr.start();
}
}
