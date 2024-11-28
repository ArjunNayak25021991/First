package Arjun;
import java.util.Arrays;
import java.util.List;
public class ListToArray_ListPrimitiveArray {

	    public static void main(String[] args) {
	        // Create a list of integers
	        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
	        
	     // Convert List to an array of Integers
	        Integer[] intArray = integerList.toArray(new Integer[0]);
	        // Convert List to primitive int array
	        int[] intArrayPrimitive = integerList.stream().mapToInt(Integer::intValue).toArray();

	    
	        
	        for (int num : intArray) {
	            System.out.println(num);
	        }
	            for (int numb : intArrayPrimitive) {
		            System.out.println(numb);
	       
	    }
	}
}