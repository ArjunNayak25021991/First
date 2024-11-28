package Arjun;

// Parent class
class LetterCounter {
    // Method to count upper and lowercase letters
    public void countUpperLower(String str) {
        int upper = 0, lower = 0;
        
        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is uppercase or lowercase
            if (ch >= 'A' && ch <= 'Z') upper++;
            else if (ch >= 'a' && ch <= 'z') lower++;
        }
        
        // Print the counts
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
    }
}

// Child class
public class Count_upperLowerLetter extends LetterCounter {
    public static void main(String[] args) {
        // Create an object of the child class
        Count_upperLowerLetter obj = new Count_upperLowerLetter();
        
        // Input string to count uppercase and lowercase letters
        String str = "NareshITTechnologies";
        
        // Call the method from the parent class
        obj.countUpperLower(str);
    }
}
