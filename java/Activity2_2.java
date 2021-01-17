package javaActivity_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Plane plane = new Plane(10);
		plane.onboard("Uday");
		plane.onboard("Prakash");
		plane.onboard("Verma");
		
		System.out.println("Take-Off Time is: " +plane.takeoff());
		System.out.println("Complete List of Passangers: " +plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Time of Landing is: " +plane.getLastTimeLanded());
		
	}

}

class Plane{
	
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	
	public void onboard(String passenger) {
		this.passengers.add(passenger);
	}
	
	public Date takeoff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}
	
	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();		
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}

	public List<String> getPassengers(){
		return passengers;		
	}
}