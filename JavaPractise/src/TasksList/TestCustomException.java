package TasksList;
 class VenkatCustomException extends Exception{
	   VenkatCustomException(String str){
		  super(str);
	  }
	}

class TestCustomException{
	static void check(int age) throws VenkatCustomException{
		if(age<=30)
			throw new VenkatCustomException("Young geberation");
		else if(age<=20)
			throw new VenkatCustomException("Teenage generation");
		else
			System.out.println("Middle generation");
	}
		public static void main(String args[]){
		try{
			TestCustomException obj=new TestCustomException();
			obj.check(25);
		}catch(Exception ex){
			System.out.println(ex);
		}
		}
}