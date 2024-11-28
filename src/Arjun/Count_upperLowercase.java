package Arjun;

public class Count_upperLowercase {
	public static void main(String[]args) {
		String str="NareshITTechnologies";
		int upper=0, lower=0 ;
		for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
			
		if(ch>='A'&& ch<='Z')upper++;
		else if(ch>='a'&& ch<='z')lower++;
		}
		System.out.println("uppercase lette;"+upper);
		System.out.println("lowercase letter;"+lower);
	
	}
}