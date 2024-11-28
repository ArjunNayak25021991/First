package Arjun;

import java.util.Scanner;

public class ConditionalStatement1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Hardcoded values for a and b
//    int a = 7;
//    int b = 5;

		System.out.println("a,b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == b) {
			System.out.println("equl");
		} else if (a > b) {

			System.out.println("a is geater");

		} else if (a < b) {

			System.out.println("a is lesser");
		}
		sc.close();
	}
}
