/**
 * 
 */

/**
 * @author Matt
 * Class Description: Creating a vehicle class to be used as the super class for all other vehicle subclasses.
 */

public class Vehicle {
	
	//Decelerations ++++++++++++++++++++++++++++++++++++++++++++++++=
	
	//Finals
	private final int MAX_SPEED = 40;
	
	//Integers
	private int numWheels = 4;
	private int numDoors = 2;
	
	//Strings
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	
	//Floats
	private float speed = 0;
	
	//Constructor ++++++++++++++++++++++++++++++++++++++
	public Vehicle(){
		
	}
	
	//Getters and setters ++++++++++++++++++++++++++++++++++++++++++
	/**
	 * @return the number of wheels on the vehicle
	 */
	public int getNumWheels() {
		return this.numWheels;
	}

	/**
	 * @return the number of doors
	 */
	public int getNumDoors() {
		return this.numDoors;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return this.colour;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return this.model;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return this.year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * @return the make
	 */
	public float getSpeed() {
		return this.speed;
	}
	
	//Functions +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
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
