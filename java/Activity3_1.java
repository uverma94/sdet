package activity3_1;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an ArrayList named myList of type String.
		ArrayList<String> myList = new ArrayList<String> ();
		
		//Add 5 names to the ArrayList using add() method.
		myList.add("Google");
		myList.add("Amazon");
		myList.add("Facebook");
		myList.add("IBM");
		myList.add("RedHat");
		
		//Then print all the names using for loop.
		System.out.println("Names of All companies in List: ");
		for (String s :myList) {			
			System.out.println(s);
		}
		
		//Then use get() method to retrieve the 3rd name in the ArrayList.
		System.out.println("Third Company from List: " +myList.get(2));
		
		//Use contains() method to check if a name exists in the ArrayList.
		System.out.println("Please check if Uber is in the company list: " +myList.contains("Flipkart"));
		System.out.println("Please check if Google is in the company list: " +myList.contains("Google"));
		
		//Use size() method to print the number of names in the ArrayList.
		System.out.println("Size of Orginal company List is: " + myList.size());
		
		//Use remove() method to remove a name from the list and print the size() of the list again.
		
		System.out.println("Removing Facebook from Company List:" +myList.remove(2));
		
		System.out.println("Size of Company List after removing Facebook: " +myList.size());

	}

}
