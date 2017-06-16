package ExceptionHandlingExamples;

public class MultipleCatchBlocks {
public static void main(String args[]){
	
	try{
		int arr[]= new int[5];
		arr[5]=30;
	}catch(ArithmeticException ae){System.out.println("First Cathc Block");}
	catch(ArrayIndexOutOfBoundsException aie){System.out.println("Second Catch Block");}

	
	System.out.println("Rest of the code...........");
}
}
