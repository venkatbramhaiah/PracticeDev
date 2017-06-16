package LogicalPractice;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int arr[]={2,4,1,5,9,3,2};
		int n=arr.length, temp;
		System.out.println("The length of the array :"+n+"\n===============");
		
//		Arrays.sort(arr);
//		for(int sort:arr){
//			System.out.println(sort);
//		}
		 for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
		 System.out.println("Accendending order==");
		for(int i=0;i<=(n-1);i++){
			System.out.println(arr[i]);
		}
		System.out.println("Decending order==");
			for(int i=(n-1);i>=0;i--){
				System.out.println(arr[i]);
			}
		
	
	}

}
