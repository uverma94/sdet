package javaActivity_2;

public class Activity2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "JAVA";
		Book newNovel = new Mybook();
		newNovel.setTitle(title);
		System.out.println("Name of Book: " +newNovel.getTitle());
	}
}

//Create an abstract class Book
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}
class Mybook extends Book {
	public void setTitle(String s) {
		title = s;
	}	
}