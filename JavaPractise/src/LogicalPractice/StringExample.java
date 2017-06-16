package LogicalPractice;

public class StringExample {

	public static void main(String[] args) {
		int n, count=0; 
		String rev="";
		String remain="";
		
		String str="I am going to work on string";
		StringBuffer sb=new StringBuffer(str);
		
		n=str.length();
		
		String split[]=str.split("\\s");
		
		System.out.println("The length of the String is "+n+"\n===================");

		for(String sp:split){
			System.out.println(sp);
		}
		System.out.println("=======================================");
         for(int i=n-1;i>=0;i-- ){
        	 rev+=str.charAt(i);
         }
         System.out.println("Reverse of the String is: "+rev+"\n===================");
         
         
	}

}
