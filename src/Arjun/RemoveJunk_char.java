package Arjun;

public class RemoveJunk_char {

	public static void main(String[] args) {
		String inputStr = "i !@#$S56RING==+2473";
//		 String str = inputStr.repeat(5);

		String cleanedStr = inputStr.replaceAll("[^a-zA-Z0-9]", "");
//	        String cleanedStr = inputStr.replace('R','r');//,'I','i','N','n','G','g' );
		System.out.println(cleanedStr.replace('R','r'));
		System.out.println(cleanedStr.toLowerCase());		
	        
		System.out.println(cleanedStr.toUpperCase());
          System.out.print("\n" +inputStr);

	}

}