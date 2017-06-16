package InnerClassesPractice;

public class LocalInnerCalssEx {

	private int age=24;
	
	void display(){
		class Inner{
			 void msg(){
				 System.out.println("The age of the person is " +age);
			 }
		}
		Inner obj= new Inner();
		 obj.msg();
	}
	public static void main(String args[]){
		LocalInnerCalssEx obj1=new LocalInnerCalssEx();
		obj1.display();
	}
	
}
