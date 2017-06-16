package TasksList;

public final class ImmutableValues {
	final String pancardNumber;  
	  
	public ImmutableValues(String pancardNumber){  
	this.pancardNumber=pancardNumber;  
	}  
	  
	public String getPancardNumber(){  
	return pancardNumber;  
	}  
	  
	

public static void main(String args[]){
	ImmutableValues obj=new ImmutableValues("123YXA");
	
	String num=obj.getPancardNumber();
	System.out.println(num);
}

}