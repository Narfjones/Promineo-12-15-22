package projects;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import projects.entity.Project;
import projects.exception.DbException;
import projects.service.ProjectService;
import java.math.*;

public class ProjectsApp {
	private Scanner scanner = new Scanner(System.in);
	private ProjectService projectService = new ProjectService();
	
	// @formatter:off
	private List<String> operations = List.of(
		"1: Add a Project"	
	);
	// @formatter: on
	
  public static void main(String[] args) {
    new ProjectsApp().processUserSelections();
  }
  
  private boolean exitMenu() {
	  System.out.println("Our show is over for tonight. Thank you for attending");
	  return true;
  }
  
  private void processUserSelections() {
	  boolean done = false;
	  
	  while(!done) {
		  try {
			  int selection = getUserSelection();
			  
			  switch(selection) {
			  
			  case -1:
				  done = exitMenu();
				  break;
			  case 1:
				  createProject();
				  break;
			  default:
				  System.out.println("\n" + "That's not a  valid choice my friend. Thank you though for being a friend");
				  break;
			  }
			  
		  }
		  catch(Exception e) {
			  System.out.println("\nTHERE HAS BEEN AN ERROR!! FIX IT!" + "\n" + e);
		  }
	  }
	  
  }
  
  private void createProject() {
	  String projectName = getStringInput("Enter your project's Name: ");
	  String notes = getStringInput("Is the everything on your order sir?:");
	  BigDecimal estimatedHours = getDecimalInput("How long do you think it'll take?");
	  BigDecimal actualHours = getDecimalInput("How long did it actually take?");
	  Integer difficulty = getIntInput("How hard is it?(1-5)");
	  
	  Project project = new Project();
	  
	  project.setProjectName(projectName);
	  project.setNotes(notes);
	  project.setEstimatedHours(estimatedHours);
	  project.setActualHours(actualHours);
	  project.setDifficulty(difficulty);
	  
	  Project dbProject = projectService.addProject(project);
	  System.out.println("All done. Thank you for visiting Wendy's");  
  }
  
  
  
  private int getUserSelection() {
	  printOperations();
	  
	  Integer input = getIntInput("Enter a menu selection");
	  
	  return Objects.isNull(input) ? -1 : input;
  }
  
  private void printOperations() {
	  System.out.println("\nHere are the options my friend. Type the number that corresponds to your choice:");
	  
	  operations.forEach(line -> System.out.println("  " + line));
  }
  
  private Integer getIntInput(String prompt) {
	  String input = getStringInput(prompt);
	  
	  if(Objects.isNull(input)) {
		  return null;
	  }
	  
	  try {
	  	return Integer.valueOf(input);
  	  } catch(NumberFormatException e) {
		throw new DbException(input + "is not a valid number pal. Thanks though. Try again.");
	  }	  
  }

  private BigDecimal getDecimalInput(String prompt){
	String input = getStringInput(prompt);
	  if(Objects.isNull(input)) {
		  return null;
	  }
	  
	  try {
	  	return new BigDecimal(input).setScale(2);
  	  } catch(NumberFormatException e) {
		throw new DbException(input + "is not a valid decimal number pal. Thanks though. Try again.");
	  }	  
  }
  
  private String getStringInput(String prompt) {
	  System.out.print(prompt + ":");
	  String input = scanner.nextLine();
	  
	  return input.isBlank() ? null : input.trim();
  }
  
}
