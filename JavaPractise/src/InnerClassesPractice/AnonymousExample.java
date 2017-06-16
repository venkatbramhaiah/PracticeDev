package InnerClassesPractice;

public  abstract class AnonymousExample {
 abstract void eat();
}
 class InnerAnonymous{
	 public static void main(String args[]){
		 
		 AnonymousExample obj=new AnonymousExample() {
			
			void eat() {
System.out.println("The age of the persion is ");				
			}
		}; 
		obj.eat();
		 
		 
	 }
}
