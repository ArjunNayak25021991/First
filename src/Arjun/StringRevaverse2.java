package Arjun;

public class StringRevaverse2 {

	public static void main(String[] args) {
		
		   String str ="Arjun pawar";
		   
			String reversedStr="";
			for(int i=str.length()-1;i>=0;i--) {
				reversedStr=reversedStr+str.charAt(i);
			System.out.println(reversedStr);
//			System.out.println(str.charAt(+i));
//			System.out.println("original string:"+str);
//			System.out.println(" reversed string of given:"+reversedStr);
		}
	}

}

//DirectMethod--->String reversedString = new StringBuilder("Arjun pawar").reverse().toString();
//System.out.println(reversedString);