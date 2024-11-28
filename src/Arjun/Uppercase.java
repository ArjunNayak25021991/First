package Arjun;

public class Uppercase {
	public static void main(String[] args) {
		String str = "hello WoRld";
		int upperCount = 0;
		int lowerCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch))
				lowerCount++;
			else
				upperCount++;
		}
		System.out.println(upperCount + " " + lowerCount);
		System.out.println(str.length());
		String strUpper = str.toUpperCase();
		System.out.println(strUpper);
		System.out.println(str);
		System.out.println(str.isEmpty());
	}

}
