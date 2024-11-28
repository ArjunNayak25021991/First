package Arjun;

public class upperandlower {

	public static void main(String[] args) { 

		        String string = "NareshITTechnologies";

		        // Initialize counters for uppercase and lowercase characters
		        int upperCount = 0; int lowerCount = 0;

		        // Loop through each character in the string
		        for (int i = 0; i < string.length(); i++) {
		            char ch = string.charAt(i);
		            
		            // Check if the character is uppercase
		            if (Character.isUpperCase(ch)) {
		                upperCount++;
		            }
		            // Check if the character is lowercase
		            else if (Character.isLowerCase(ch)) {
		                lowerCount++;
		            }
		        }
		        
		        System.out.println("uppercase;"+upperCount);
		        System.out.println("lowercase;"+lowerCount);
	}
	}