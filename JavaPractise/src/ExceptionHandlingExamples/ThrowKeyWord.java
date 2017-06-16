package ExceptionHandlingExamples;

public class ThrowKeyWord {

	  void check(int age) throws Exception{
		if(age<18)
			throw new Exception("Not allowed to Vote");
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String args[]) throws Exception{
		ThrowKeyWord obj= new ThrowKeyWord();
		obj.check(18);
		System.out.println("rest of the code");
		
	}
}
