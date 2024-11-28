package Arjun;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Array_reverse_duplicate {


public static void main (String[] args) {
	int[] array= {3,6,9,8,5,2,1,4,7,10,3,10};
	for(int i=array.length-5;i>=0;i--) {    /*1. Start from the 5th position from the end 
	                                         of the array and go backwards.(length -n is deserve 
	                                         the reverse of the value.
	                                         
		                                     2.Iterate over the array from index 0 to the end
		                                     for (int i = 0; i < array.length; i++) {
                 								System.out.println(array[i]); 
		                                    */
		System.out.println(array[i]);
}

Set<Integer> set=new HashSet<>();
	for(int num:array) {
	set.add(num);
	}
	System.out.println(set);
//	Iterator it=set.iterator();
//	while(it.hasNext());
//	
//		System.out.print(it.next()+" ");
}
}
	
	/*--->set takes only unique values(can't' read index value),list reads only index value.
	 * to change list->set--->list-array-object array,then it will convert.
	 * pop up will be inspect but not alert,notification is at browser level.
	 * to remove duplicates, set--> will not repeat the same values
	
 Syntax number
  if (i==1)
 */
	/*for ascending order
	  Arrays.sort(array);
	System.out.print(" "+Arrays.toString(array));
	*/
/*  Arrays.sort(array, Collections.reverseOrder());

        // Printing the sorted array
        System.out.println("Array in descending order: " + Arrays.toString(array));
        */


