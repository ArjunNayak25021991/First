package Arjun;

public class Loops {

//print hello world 100 times,numbers 0-10
	public static void main(String[] args) {
		int start = 1;
		int end = 10;// 100
		for (int i = start; i <= end; i++) {
			int a = end * 2;

			String str = "hello world";
//		String str=("1-10"); // if only need to print 10 time helloworld
//for(int counter=0;counter<100;counter=counter+1) {  //if only need to print 100 time  helloworld
//	for(int counter=0;counter<11;counter=counter+1) {   //if only need to print helloworld
			System.out.println("serial number:" + i + "\n" + str);
//		System.out.println(str);  //for helloworld print
			System.out.println(a);
		}
	}
}
