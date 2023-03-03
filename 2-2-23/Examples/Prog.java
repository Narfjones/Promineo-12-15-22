public class Prog{
    
    public static void main(String[] args){
        Car car1 = new Car(false);
        
        car1.honk();
        newOwner("Bill", car1);

        
    }
    
    public static void newOwner(String name, Car c) {
        String owner = name;
        c.changeGas(true);
        c.setName(owner);
    	System.out.println("The car named " + c.getName() + " belongs to " + owner + "now.");
        System.out.println(c.isGas());
    }

}