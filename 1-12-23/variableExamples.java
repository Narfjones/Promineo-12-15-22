public class variableExamples {
    
    public static void main(String[] args){

        int number = 5; // any positive or negative whole number
        double decimal = 5.5; // any positive or negative decimal number
        String word = "Motorcycle"; // any string of alphanumeric characters
        char character = 'a';
        boolean torf = true; // always true or false

        int answer = sum(4,5);
        System.out.println(answer);

        printCustomMessage("Rocky III is only good because of the soundtrack.");
        printCustomMessage("Java is an object oriented programming languge. Get outta here javascript noobs.");
        printCustomMessage("1,348");

    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static void printMessage(){
        System.out.println("Hey, how's it going? Rambo II is better than Rambo, First Blood. Fight me.");
    }

    public static void printCustomMessage(String str){
        String msg = str;
        System.out.println(msg);
    }

}
