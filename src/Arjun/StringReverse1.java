package Arjun;

public class StringReverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str="arjun pawar";
			String reversedStr="";
			for(int i=str.length()-1;i>=0;i--) {
				reversedStr=reversedStr+str.charAt(i);
//				reversedStr+=str.charAt(i);
			}
			System.out.print("original string:"+str);
			System.out.println(" reversed string of given:"+reversedStr);
		}
	}



