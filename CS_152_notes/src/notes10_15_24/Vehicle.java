package notes10_15_24;

public class Vehicle {
	private String enginetype;
	private int wheels;
	
	public Vehicle() {							//constructor
		this.enginetype = "default";
		this.wheels = 4;
	}											// constructor overloading
	
	public Vehicle(String enginetype) {
		this.enginetype = enginetype;   	// instance property -> input variable
	}
	
	public Vehicle(String enginetype, int wheels) { 
		this(enginetype);  // will go to constructor above and do the this.enginetype = enginetype
		this.wheels = wheels;
	}
	
	void sound() {									//method
		System.out.println("Is sounds default");
	}
	
	void move (){
		System.out.println("It moves");
	}
			
	void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	
	void setWheels(int wheels) {
		this.wheels = wheels; 
	}
	
	int getWheels() {
		return this.getWheels();
	}
	
	
}
