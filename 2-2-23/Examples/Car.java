public class Car extends Vehicle{

	private boolean gas;
	private String name;
	
	public Car(boolean g) {
		super(); // Runs the parent constructor
		gas = g;
		name = null;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		if ( name == null ){
			System.out.println("This car does not have a name");
			return null;
		} else{
		return name;
		}
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
		changeGas(true);
	}
	
}