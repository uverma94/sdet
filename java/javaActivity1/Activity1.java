package javaActivity1;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car Suzuki = new Car();
		
		Suzuki.make = 2014;
		Suzuki.color = "Black";
		Suzuki.transmission = "Manual";
		
		Suzuki.displayCharacteristics();
		Suzuki.accelarate();
		Suzuki.brake();
		
	}

}
