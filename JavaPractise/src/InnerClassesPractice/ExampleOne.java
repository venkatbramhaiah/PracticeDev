package InnerClassesPractice;

public class ExampleOne {
	private int x=24;
	
	class InnerOne{
	 void display(){
		 System.out.println("The age of the person is: "+x);
	 }
	}
	
	public static void main(String args[]){
		ExampleOne out=new ExampleOne();
		ExampleOne.InnerOne in= out.new InnerOne();
		in.display();
	}

}
