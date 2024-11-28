package Arjun;
import java.util.Scanner;
//print the sum of first N natural numbers
public class SumOfFirstNNaturalNumber {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		int sum= 0;
		for(int i=1;i<=5;i++)		/*for(int i = 1; i <= 5; i++);	-->(The for loop has an extra semicolon (;) at the end of the line
																		This makes the loop body empty, so it doesn’t execute as expected.)*/
		sum=sum+n;
		System.out.println(sum);
		sc.close();
		/*with hard coded (with out using scanner class)  
		 * int n=10;
		int sum=0;
		for( int i=0;i<=n;i++) {
			
			sum+=i;
			//sum=n*(n+1)/2
			
		}
		
		System.out.println("ab"+n+"dc"+sum);*/
	}	
}
