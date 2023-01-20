import java.util.Scanner;
import java.util.Arrays;

public class Week3 {

	public static void main(String[] args){
       
		arrExample();
		
    }
	
	
	public static void arrExample() {
		
		int[] arr = { 0, 1, 2, 3, 4, 5 }; // Create array
		
		int[] arr2 = Arrays.copyOf(arr, arr.length +1); // Create new array with a length bigger
		
		arr2[6] = 6; // Add something to the new index
		
		System.out.println(Arrays.toString(arr)); // Print original array
		
		System.out.println(Arrays.toString(arr2)); // Print new bigger array
		
		System.out.println(Arrays.binarySearch(arr, 3)); // Search for the number 3 in array
	
		// Loop through array of integers
		for (int i : arr) {
			System.out.println(arr[i]); // Print value in current index
		}
		
		
		// Loop through array of integers
		for (int i : arr2) {
			System.out.println(arr2[i]); // Print value in current index
		}
		
	}
	
	
	
	public static void scannerExample() {
		Scanner input = new Scanner(System.in); // Create Scanner Object
		
		System.out.println("Welcome to my calculator: Would you like to add(1) or subtract(2)?");
		
		String choiceS = input.nextLine(); // Get user input from console
		int choice = Integer.parseInt(choiceS); // Turn user input into an integer
		
		if (choice == 1) {
			System.out.println("What's the first number?");
			String intAs = input.nextLine(); // Get user input from console
			int intA = Integer.parseInt(intAs); // Turn user input into an integer
			
			System.out.println("What's the second number?");
			String intBs = input.nextLine(); // Get user input from console
			int intB = Integer.parseInt(intBs); // Turn user input into an integer
			
			System.out.println(addNum(intA, intB));
			
		} else {
			System.out.println("What's the first number?");
			String intAs = input.nextLine(); // Get user input from console
			int intA = Integer.parseInt(intAs); // Turn user input into an integer
			 
			System.out.println("What's the second number?");
			String intBs = input.nextLine(); // Get user input from console
			int intB = Integer.parseInt(intBs); // Turn user input into an integer
			
			System.out.println(subtractNum(intA, intB));
		}
		
	}
	
	
	// Create method that adds two integers *must send integers when this method is called*
	public static int addNum(int a, int b) {
		int solution = a + b;
		return solution;
	}
	
	// Create method that subtracts two integers *must send integers when this method is called*
	public static int subtractNum(int a, int b) {
		int solution = a - b;
		return solution;
	}
	
}
