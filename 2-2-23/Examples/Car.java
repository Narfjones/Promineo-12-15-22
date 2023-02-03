public class Car extends Vehicle{

	private boolean gas;
	
	public Car(boolean g) {
		super(); // Runs the parent constructor
		gas = g;
	}
	
	public boolean isGas() {
		return gas;
	}
	
	public String changeGas(boolean g) {
		gas = g;
		String str = "Your car type has changed.";
		return str;
	}
	
	public  void honk() {
		System.out.println("ba ba ba da da ba da da");
	}
	
}