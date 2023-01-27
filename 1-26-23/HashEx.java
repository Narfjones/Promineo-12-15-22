import java.util.HashMap;
import java.util.Map;

public class HashEx {
    public static void main(String[] args) {
		HashMap<String, Integer> grades = new HashMap<>(); //create new HashMap
		
		String[] stuNames = {"Bob", "Sally", "Gerald", "Mat", "Egwene", "Morain"}; // Array of student names
		int[] stuGrades = {94, 92, 68, 71, 98, 100}; // Array of student grades
		
        // Add student names and grades from array to the HashMap
		for(int i = 0; i < stuNames.length; i++) {
			grades.put(stuNames[i], stuGrades[i]);
		}
		
        // Get a grade by student name
        System.out.println(grades.get("Morain"));

        // HashMaps aren't iterable so use a for each loop
		for (Map.Entry<String,Integer> entry: grades.entrySet()) // Travel through each element of the HashMap
			System.out.println(entry.getKey() + " - " + entry.getValue()); // Print the Keys + Values
	}
}
