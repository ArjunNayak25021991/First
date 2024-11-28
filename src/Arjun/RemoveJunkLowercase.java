package Arjun;



public class RemoveJunkLowercase {
    public static void main(String[] args) {
        String inputStr = "!@#$S56RING==247i3";

        String cleanedStr = inputStr.replaceAll("[^a-zA-Z0-9]", "");
        //"[^a-zA-Z0-9]", "");removing and replacing in"__"

        cleanedStr = cleanedStr.replaceAll("i", "");
        
        
		  // Remove the first character 'i' 
      //  if (cleanedStr.length() > 17 && cleanedStr.charAt(18) == 'i') >>specific length
        { cleanedStr = cleanedStr.substring(1); }
		 

        System.out.println(cleanedStr);
    }
}
