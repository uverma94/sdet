package activity3_1;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a HashSet named hs.
		HashSet<String> hs = new HashSet<String> ();
		
		//Add 6 objects using add() method to the HashSet.
		hs.add("IBM");
		hs.add("Google");
		hs.add("Facebook");
		hs.add("RedHat");
		hs.add("Amazon");
		
		//Original HashSet
		System.out.println("Original Set is: " +hs);
		//Then print the size of the HashSet using the size() method.
		System.out.println("Size of Hashset is: " +hs.size());
		
		//Remove an element using the remove() method.
		System.out.println("Removing an Element 'Google' from HashSet: " +hs.remove("Google"));
		
		//Also try to remove an element that is not present in the Set.		
		if(hs.remove("Uber")) {
			System.out.println("Uber has been removed from the Set");
		}
		else {
			System.out.println("Uber is not present in the Set");
		}
		
		//Use the contains() method to check if an item is in the Set or not.		
		System.out.println("Check if Facebook is present in the HashSet:" +hs.contains("Facebook"));
		System.out.println("Check if Google is present in the HashSet:" +hs.contains("Google"));
		
		//Print the updated set.
		System.out.println("Updated Set: " +hs);
		
	
	}

}
