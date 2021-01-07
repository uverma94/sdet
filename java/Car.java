package javaActivity_1;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){		
		doors = 4;
		tyres = 4;
		}
    public void displayCharacteristics() {
    	
	System.out.println("color of the car: "+color);
	System.out.println("transmission of car: "+transmission);
	System.out.println("make of car:"+make);
	System.out.println("tyres of car:"+tyres);
	System.out.println("doors of car:"+doors);
    }

    public void accelarate() {
    	
    System.out.println("Car is moving Forward.");
    	
    }
    
    public void brake() {
    	
    System.out.println("Car has stopped.");	
    }
    
}
