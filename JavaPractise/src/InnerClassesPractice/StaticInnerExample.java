package InnerClassesPractice;

public class StaticInnerExample {

	static int age=24;
	
	static class InnerOne{
		void display(){
			System.out.println("The age of the person is "+age);
		}
		
		static void msg(){
			System.out.println("Static method output");
		}
	}
	
	public static void main(String args[]){
		
		StaticInnerExample.InnerOne obj=new StaticInnerExample.InnerOne();
		obj.display();
		StaticInnerExample.InnerOne.msg();//no need to create the instance of static nested class  
		
	}
	 
}
