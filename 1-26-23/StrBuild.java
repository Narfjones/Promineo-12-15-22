import java.lang.StringBuilder;

public class StrBuild {

    public static void main(String[] args){

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int avg = avgChar(names);
        System.out.println(avg);
        
        stringMaker(names);
        
    }

    public static int avgChar(String[] arr){
        int avgSum = 0;

        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            avgSum += str.length();
        }

        int avg = avgSum / arr.length;
        return avg;
    }

    public static void stringMaker(String[] arr){
        StringBuilder strSum = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
        	strSum.append(arr[i]);
        	strSum.append(" ");
        }
        
        System.out.println(strSum);

    }
}
