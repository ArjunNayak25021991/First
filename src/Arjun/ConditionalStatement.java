package Arjun;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Age:");
		int age=sc.nextInt();
		// ob=age;ob=22;
		if(age>18) {
			System.out.println("adult");
		}
			else{
				System.out.println("not-adult");
				
				
			}
		sc.close();
	}
	
	}

/*stmt 1
stmt 2
if (condition) {
	stmt 3
	stmt 4
	else {
		stmt 5
		stmt 6
*/
