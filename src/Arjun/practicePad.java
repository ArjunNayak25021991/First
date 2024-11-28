package Arjun;

//count the Frequency of Characters
public class practicePad {

	public static void main(String[] args) {
		String str = "proGRaMMinG";
		System.out.println(str.length());
		
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}

}

/*
 package Arjun;

public class PracticePad {
    public static void main(String[] args) {
        String str = "proGRaMMinG";
        int count = 0; // Use an integer to count characters

        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get each character
            System.out.println("Character at index " + i + ": " + ch);
            count++; // Increment the count for each character
        }

        System.out.println("Total number of characters: " + count);
    }
}

 */

	
/*==splits means removing unwanted data.
 In Java, splitting refers to breaking a string into multiple parts or substrings 
 based on a specific delimiter or regular expression. This is commonly done using the 
 split() method provided by the String class.

	    public static void main(String[] args) {
	        String str = "Hello world, welcome to Java programming";
	        String[] words = str.split("\\s+"); // Splitting on spaces

	        System.out.println("Number of words: " + words.length);
	    }
	}
	=========================================
	public class SplitExample {
    public static void main(String[] args) {
        String str = "Java,is,fun,to,learn";
        String[] parts = str.split(",", 3); // Limit to 3 parts
        for (String part : parts) {
            System.out.println(part);
        }
    }
}

	
	
	=======================================
	1.Signature:


public String[] split(String regex)
public String[] split(String regex, int limit)
The split() method returns an array of strings.
The first variant splits the string based on the specified regular expression (regex).
The second variant allows you to limit the number of substrings returned.
2.Parameters:

regex: The regular expression or delimiter used to split the string.
limit: The maximum number of substrings to return. If the limit is 0, trailing empty strings are discarded.
3.Return Value:

An array of strings split from the original string.
===>splitting by a coma(,),splitting by a space(" "),splitting by a regular 
expression(\\d--->splits digits),Limiting the Number of Splits(str.split{(",", 3); 
Limit to 3 parts)}

 =======================
 Use Cases of Splitting
Parsing CSV (Comma-Separated Values): Splitting rows of a CSV file into individual values.

Processing User Input: Splitting commands or sentences entered by users.

Log Analysis: Breaking down log files for analysis based on spaces, commas, or other delimiters.

Tokenization: Converting a sentence into tokens (words) for language processing tasks.

=====================================
Important Notes
Special Characters in Regex:

If the delimiter is a special character in regex (e.g., . or |), it must be escaped using a double backslash (\\).
java
Copy code
String str = "a.b.c";
String[] parts = str.split("\\.");
Empty Strings in Results:

If the string starts or ends with the delimiter, the resulting array may contain empty strings.
Performance:

The split() method uses regex internally, which can impact performance for large strings or complex patterns.
===============
*/
