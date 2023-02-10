public class ConditionalsExample {
    // Create a conditional statement that determines if you are eligible for AARP

    public static int ageLimit = 65;
    public static int age;
    public static boolean retired;
    public static boolean membership;
    public static boolean cool;

    


    public static void main(String args[]){

        // && AND operator (true+false=false   true+true=true   false+false=false)
        // || OR operator  (true+false=true    True+true=true   false+false=false)

        if (age >= ageLimit){
            membership = true;
        } else {
            membership = false;
        }

        // Ternary Operator
        age = (cool) ? 65 : 46;
        // variable = (condition) ? conditionTrue : conditionFalse;

        switch(age){
            case 60: 
                System.out.println("Come back in 5 years");
                break;
            case 55:
                System.out.println("Come back in 10 years");
                break;
            case 35:
                System.out.println("Get out of here bucko");
                break;
            default:
                System.out.println("Enter a valid age");
                break;
        }

    }



    // Create a conditional statement that tells the user if they have guessed a number correctly
        // Bonus! Tell the user if their guess was too high or too low

        

    // Create a conditional that gives the user a word that starts with the letter they choose

}
