package javaActivity_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Scanner object named scan.
		Scanner scan = new Scanner(System.in);
		
		//Create an ArrayList object named list.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Create a Random class object named indexGen.
        Random indexGen = new Random();
        
       
        System.out.println("Enter Numbers(Integer Only): ");
        
        //Add a scan statement with nextInt() to accept only integer values, inside a loop to accept multiple values.
        //Use the hasNextInt() method with the loop to ensure only integer values are accepted.
        while(scan.hasNextInt()) {        	
        	list.add(scan.nextInt());
        }
		
        //To print the number from an array, we convert the ArrayList into an array using the toArray() method
        Integer nums[] = list.toArray(new Integer[0]);
        
        //Use indexGen to generate an integer value with the bounds set to the length of nums array.
        int index = indexGen.nextInt(nums.length);
        
        //Print the index value that was generated and the value in the array at that index value.
        System.out.println("Index value generated: " +index);
        System.out.println("value in the array at that index value" + nums[index]);
        
        scan.close();
	    }
				
	}

