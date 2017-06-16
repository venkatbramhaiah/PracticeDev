package TasksList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String args[]){
		String str1="java";
		String str2="Best programing languge in the world is java";
		
		Pattern pat=Pattern.compile(str1);
		Matcher mat=pat.matcher(str2);
		
		if(mat.find()){
			System.out.println("Match found in the index position "+mat.start());
		}
		else{
			System.out.println("Match not found");
		}
	}
}
