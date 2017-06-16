package InnerClassesPractice;

interface AnonymousExampleInterface {
	void eat();
}
class InnerOne{
	public static void main(String args[]){
		AnonymousExampleInterface obj=new AnonymousExampleInterface() {
			public void eat() {
System.out.println("Hello");				
			}
		};
		obj.eat();
	}	
}
