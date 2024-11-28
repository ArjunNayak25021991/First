package Arjun;
/*ASCII stands for American Standard Code for Information Interchange. It is a character encoding standard used to represent text in computers, communication equipment, and other devices that use text.
 */
 
public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "programming";
		StringBuilder result = new StringBuilder();
		boolean[] seen = new boolean[256]; // Assuming ASCII characters

		for (char ch : str.toCharArray()) {
			if (!seen[ch]) {
				result.append(ch);
				seen[ch] = true;
			}
		}

		System.out.println("String after removing duplicates: " + result);
	}
}
