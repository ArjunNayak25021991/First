package Arjun;

public class Arithmatic {
	public static void main(String[] args) {
		// variables

		int a = 20;
		int b = 5;

		int sum = a + b;
		int diff = a - b;
		int mult = a * b;
		int div = a / b;
	System.out.println("abcd:"+sum);
	System.out.println("ab:"+diff);
	System.out.println("cd:"+mult);
	System.out.println("sd:"+div);
	
		for (int i = 21; i >= a; i--) { // with condition based
			System.out.print("condition1"+i + a+"\n");
		}
		for (int j = 9; j >= b; j--) {	// with condition based
			System.out.print("condition2"+j + b+",");
		}
		System.out.println("xy"+ sum);
		System.out.println("yz"+diff);
		System.out.println("za"+mult);
		System.out.println("vb"+div);
		System.exit(a);//terminates the program
	}
}

/*
  1. percentage(%)-->modulo(remainder) 2. terminator(;)-->indicate line or
  statement closed. 3. float,double are giving same result e.i[c.0] and
  int,long are giving same result e.i.[c]
 */
