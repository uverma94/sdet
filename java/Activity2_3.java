package javaActivity_2;

interface BicycleParts{
	public int gears = 0;
	public int speed = 0;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
	
	public int gears;
	public int speed;
	
	public Bicycle(int gears, int speed) {		
		this.gears = gears;
		this.speed = speed;
	}
	
	public void applybrake(int decrease) {
		speed -=decrease;
		System.out.println("Current Speed : " +speed);	
	}
	
	public void speedUp(int increase) {
		speed +=increase;
		System.out.println("Current Speed : " +speed);
		
	}
	public String bicycleDesc() {
		return("No of gears " +gears+"\nCurrent speed of Bicycle " +speed);		
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		
	}
}

class MountainBike extends Bicycle {
	public int seatHeight;
	
	public MountainBike(int gears, int speed, int Height) {
		super(gears, speed);
		seatHeight = Height;
	}
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public String bicycleDesc() {
		return (super.bicycleDesc()+"\nSeat height is :" +seatHeight);
	}
}
public class Activity2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike M = new MountainBike(5,0,15);
		System.out.println(M.bicycleDesc());
		M.speedUp(25);
		M.applybrake(6);
}
}