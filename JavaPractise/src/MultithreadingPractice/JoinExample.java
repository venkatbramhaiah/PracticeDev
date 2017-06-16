package MultithreadingPractice;

public class JoinExample extends Thread {
	
	public void run(){
		for(int i=1;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		JoinExample obj1=new JoinExample();
		JoinExample obj2= new JoinExample();
		JoinExample obj3= new JoinExample();
		
		obj1.start();
		try{
		obj1.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		obj2.start();
		obj3.start();
	}

}
