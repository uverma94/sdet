package javaActivity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {10,77,10,54,-11,10};
		//System.out.println("Original Array: " + Arrays.toString(numbers));
		
		int searchnum = 10;
		int sum = 30;
		
		System.out.println("Result:" + result(numbers, searchnum, sum));
		
	}
	 public static boolean result(int[] numbers, int searchnum, int sum) {
	        int temp = 0;
	      
	        for (int number : numbers) {
	          
	            if (number == searchnum) {	              
	                temp += searchnum;
	            }
	          
	            if (temp > sum) {
	                break;
	            }
	        }

	        return temp == sum;
	    }

}
