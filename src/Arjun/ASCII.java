package Arjun;
/*
 ASCII stands for American Standard Code for Information Interchange. It is a
  character encoding standard used to represent text in computers, communication 
  equipment, and other devices that use text.
 */
public class ASCII {
	
	    public static void main(String[] args) {
	        for (char ch = 32; ch <= 126; ch++) {
	            System.out.println("Character: " + ch + " | ASCII Value: " + (int) ch);
	        }
	    }
	}


/*
 Key Points about ASCII:
Standardized Encoding:

Each character (letters, numbers, punctuation, etc.) is represented by a unique numerical code.
7-bit Encoding:

Original ASCII uses 7 bits to represent characters, which allows for 128 unique symbols (0 to 127).
These include:
Control characters (0–31): Used for non-printable actions (e.g., newline, tab, etc.).
Printable characters (32–126): Includes letters, numbers, punctuation, and symbols.
Extended ASCII:

Later extended to 8 bits to support 256 characters (0 to 255), which includes additional symbols and non-English characters.
Human-Readable Format:

ASCII is simple and widely used for representing English text.
===================================
ASCII characters are divided into three main groups:

Range			Type						Examples
0–31		Control characters				\n (newline), \t (tab)
32–126		Printable characters			A-Z, a-z, 0-9, @, #, etc.
127			Delete (non-printable)			-
==============================================
Character		ASCII Code (Decimal)	ASCII Code (Binary)
A				65						01000001
a				97						01100001
0				48						00110000
Space			32						00100000
!				33						00100001
@				64						01000000
=========================================

How ASCII is Used
Text Representation:

Text files (like .txt) use ASCII to encode characters.
Example: "Hello" in ASCII is 72 101 108 108 111.
Programming:

ASCII is often used in programming to manipulate characters.
Example:
char ch = 'A'; // ASCII code is 65
int asciiValue = (int) ch; // Converts 'A' to its ASCII value
Keyboard Input:

When you press a key on a keyboard, the corresponding ASCII code is sent to the computer.
Networking:

Protocols like HTTP and FTP use ASCII for text communication.
=====================================
Limitations of ASCII
Limited Characters:
Only supports English and a few special characters.
Not Suitable for Global Text:
Cannot represent characters from other languages like Chinese, Arabic, etc.
Unicode (e.g., UTF-8) is used for more comprehensive encoding.

 */
 
