package ExceptionHandlingExamples;

public class TestSrikanth {
	@SuppressWarnings("finally")
	int div(int a, int b){
		
		try{
			int res=2/0;
			System.out.println(res);
			return res;
		}catch(Exception e){
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("After the exception code");
			
			return 3;
		}
		
		
	}
	
	public static void main(String args[]){
		TestSrikanth obj= new TestSrikanth();
		int k=obj.div(1, 2);
		System.out.println(k);
		
		
	}

}
