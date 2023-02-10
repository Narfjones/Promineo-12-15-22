public class Prog{
    
    public static void main(String[] args){
        Vehicle car1 = new Car(false);
        
        car1.honk();

        
    }
    
    public static void newOwner(String name, Vehicle c) {
    	System.out.println("Car 1 belongs to Bob now.");
    }

}