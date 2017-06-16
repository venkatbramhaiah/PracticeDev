package TasksList;

public class FinalStaticMethod {
	final static int sum(int a, int b){
		return a+b;
		
	}

	public static void main(String[] args) {

		FinalStaticMethod obj = new FinalStaticMethod();
		
		int res= obj.sum(2,4);
		System.out.println(res);
		 
	}

}
