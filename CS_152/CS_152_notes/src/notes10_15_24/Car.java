package notes10_15_24;

public class Car extends Vehicle{
	String type;
	
//	public Car() {
//		super();
//		this.type = "Gasoline";
//	}
	
	public Car (String enginetype, int wheels, String type) {
		super(enginetype, wheels);  // calls constructor from parent class
		this.type = type;
	}
	
	
	void sound() {
		System.out.println("Is sounds: vroom vroom");
	}
	
	void printWheels() {
		System.out.println(super.getWheels());
	}
	
	
	
	
}

