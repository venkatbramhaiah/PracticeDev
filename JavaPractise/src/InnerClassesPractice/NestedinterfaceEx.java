package InnerClassesPractice;

interface One{
	void show();

interface Two{
	void display();
	void show();
}
}
public class NestedinterfaceEx implements One.Two{
	public void show() {
System.out.println("First Interface ");		
	}
	public void display() {
		System.out.println("Second Interface ");
	}
	public static void main(String args[]){
	One.Two obj= new NestedinterfaceEx();
	obj.show();
	}

}
