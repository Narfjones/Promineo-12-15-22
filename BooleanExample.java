public class BooleanExample{
    // < less than (int, float, double)
    // > Greater than (int, float, double)
    // == (all data types)
    // != (all data types)



    public int age = 65;
    public int ageLimit = 40;
    public String name;
    public boolean tired = false;
    public boolean hungry = false;

    public void main(String args[]){
    // create 5 separate boolean expressions
    if (age > ageLimit){
        // let them into the club, they are handsome
    } else {
        // AARP is that way
    }

    if (age < 65){
        // Right this way
    } else {
        // Go live a few years first
    }


    
    if (tired) {
        System.out.println("Get this man a pillow");
    } else if(hungry){
        System.out.println("Get this man potato chip");
    } else {
        System.out.println("What do you want from me then?");
    }

    // Conditional must contain either a boolean variable or a boolean operator

}

}