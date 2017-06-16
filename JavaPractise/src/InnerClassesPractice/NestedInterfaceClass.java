package InnerClassesPractice;

public class NestedInterfaceClass {

	interface One{
		void msg();
	}
}
	
	class NestedInterfaceClassEx implements NestedInterfaceClass.One{

		@Override
		public void msg() {
System.out.println("dgsdjdf");			
		}
		
		public static void main(String args[]){
			NestedInterfaceClass.One obj=new NestedInterfaceClassEx();
			obj.msg();
		}
		
	}
