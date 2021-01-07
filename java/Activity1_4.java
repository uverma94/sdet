package javaActivity_1;
import java.util.Arrays;
public class Activity1_4 {
	
			static void InsertionSort(int array[]) {
				
	        int size = array.length, i;
	        
	        for (i = 1; i < size; i++) {
	            int key = array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < array[j]) {
	                array[j + 1] = array[j];
	                --j;
	            }
	            array[j + 1] = key;
	        }
	    }
	    
	    public static void main(String args[]) {
	        int[] data = { 2,1,4,3,7,8,6,9,8,0 };
	        InsertionSort(data);
	        System.out.println("Sorted Array in Ascending Order: ");
	        System.out.println(Arrays.toString(data));
	    }
		
}

