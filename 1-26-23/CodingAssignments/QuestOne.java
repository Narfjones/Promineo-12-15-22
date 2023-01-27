public class QuestOne {
    public static void main(String[] args){
        // Create array of numbers 3, 9, 23, 64, 2, 8, 28, 93
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // Get the length of the array
        int len = ages.length;

        // Subtract the first element from the last element
        int sub = ages[len - 1] - ages[0];

        // Print out the result
        System.out.println(sub);

        // Find the average of the valuesz
        int avgSum = 0;
        for (int i = 0; i < len; i++){
            avgSum += ages[i];
        }
        int avg = avgSum / ages.length;
        System.out.println(avg);
    }

}
