/**
 * 
 */

/**
 * @author Matt
 * Class Description: Creating a vehicle class to be used as the super class for all other vehicle subclasses.
 */

public class Vehicle {
	
	//Finals
	final int MAX_SPEED = 40;
	
	//Integers
	int numWheels = 4;
	int numDoors = 2;
	
	//Strings
	String colour = "";
	String make = "";
	String model = "";
	String year = "";
	
	//Floats
	float speed = 0;
	
	
	//Constructor
	public Vehicle(){
		
	}
	
	//Speed the car up
	public void accelerate(){
		this.speed += 4;
		
		if(this.speed >= this.MAX_SPEED)
			this.speed = this.MAX_SPEED;
	}
	
	//Slow the car down
	public void decelerate(){
		this.speed -= 6;
		
		if(this.speed <0){
			this.speed=0;
		}
	}
	
	//Have the car turn LEFT
	public void turnLeft(){
		System.out.println("Turning Left");
	}
	
	//Have the car turn RIGHT
	public void turnRight(){
		System.out.println("Turning Right");
	}
	
	
	
}
