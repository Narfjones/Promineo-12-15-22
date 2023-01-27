package Week4Problems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lists1 {

	static void findLetter(List alphabet, char userLetter) {
		// Write your code below this line 
		int ind = alphabet.indexOf(userLetter);
		System.out.println(ind);
		
		// Write your code above this line 
	}

    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char userLetter = in.next().charAt(0);
		
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		
		findLetter(alphabet, userLetter);
	}
}