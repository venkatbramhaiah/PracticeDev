package ExceptionHandlingExamples;

public class NestedTryBlock {
	public static void main(String args[]){
		int arr[]=new int[5];
		
		try{
				try{
					arr[5]=40;
				}catch(ArrayIndexOutOfBoundsException aie){
					System.out.println(aie);
				}
				try{
					arr[3]=35/0;
				}catch(ArithmeticException ar){
					System.out.println(ar);
				}
				System.out.println("Rest of the code............");
		}catch(Exception e){
System.out.println("no exceptons");		
}
		System.out.println("Rest of the code............");

	}

}
