public class Vehicle {
    private int wheels;
    private String color;
    private int cylinders;

    public Vehicle(){
        wheels = 0;
        color = "white";
        cylinders = 4;
    }

    public int getWheels(){
        return wheels;
    }

    public String getColor(){
        return color;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void honk() {
        System.out.println("honk honk");
    }
}
