package LogicalPractice;

public class ArrayEx {

	int x=10;
	public static void main(String[] args) {
		
		
		 int arr[]=new int[6];
		int temp;
		arr[0] =8; arr[1] = 9; arr[2] =3; arr[3] = 5; arr[4] = 7;
		int n=arr.length;
		System.out.println("Array length "+n);
		try{
			arr[10]=20;
		}catch(Exception e){
			e.printStackTrace();
		}
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
