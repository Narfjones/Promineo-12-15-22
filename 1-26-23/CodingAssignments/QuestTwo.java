import java.lang.StringBuilder;

public class QuestTwo {
    
    public static void main(String[] args){
        
        // Create an array of strings
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // Create and initilialize integer to hold numbers
        int avgSum = 0;

        // Run loop to get the number of characters in the strings
        for(int i = 0; i < names.length; i++){
            String str = names[i]; // Get string from current index in array
            avgSum += str.length(); // Add the strings length to average sum
        }

        int avg = avgSum / names.length; // Calculate average (total characters)/(number of elements)
        System.out.println(avg);

        stringMaker(names);

    }

    public static void stringMaker(String[] arr){
        
        StringBuilder strSum = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            strSum.append(str + " ");
        }

        System.out.println(strSum);

    }

}
