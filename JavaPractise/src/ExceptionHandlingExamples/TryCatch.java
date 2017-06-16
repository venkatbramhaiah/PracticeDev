package ExceptionHandlingExamples;

public class TryCatch {
	
	public static void main(String args[]){
		
	System.out.println("Wtih try block....................");	
		try{
			int arr[]= new int[5];
		
		arr[5]=30;
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("Please enter the valid size");
		}
		System.out.println("rest of the code will Excecute after try-catch=====");

		
	System.out.println("With out try-catch block....................");	
		int arr[]= new int[5];
		arr[5]=30;
		
		System.out.println("rest of the code will Excecute........");
	}

}
