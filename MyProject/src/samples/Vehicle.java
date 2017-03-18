package samples;

public class Vehicle {
	private int maxSpeed;
	private int wheels;
	private String color;
	private double fuelCapacity;
	
	public Vehicle() {
		this.setColor("Red");
	}
	
	public Vehicle(String c){
		this.setColor(c);
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String c){
		this.color = c;
	}
	
	public static void horn(){
		System.out.println("Beep!");
	}
}
