package Week4Problems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lists2 {

	static void beginEnd(int endNum) {

        try{
        List<Integer> nums = new ArrayList<>();

        for(int i = 1; i <= endNum; i++){
            nums.add((int) i);
        }

        int firstNum = nums.indexOf(1);
        int lastNum = nums.indexOf(endNum);

        System.out.println("The first number in the list: " + nums.get(firstNum));
        System.out.println("The last number in the list is: " + nums.get(lastNum));
        }
        catch (IndexOutOfBoundsException nums){
            System.out.println("Your List cannot be created with a number less than one.");
        }
	}
	
	
    //DO NOT CHANGE THE CODE BELOW THIS LINE 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endNum = in.nextInt();
	
		beginEnd(endNum);
	}
}