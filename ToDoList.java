package todolistproject.morg.com;

import java.util.Scanner;

/*What the program needs to do
 *  add task
 *  check off task
 *  Organize List with check-mark or x next to tasks.
 *  sort with unfinished tasks on top.
*/

public class ToDoList 
{	
	
	public static void main(String[] args) 
	{

		
		// Create new Scanner for console input
		Scanner listItem = new Scanner(System.in);
		
		
		
		
		while(true) {


			String input = promptUser(listItem);
			
			// Detecting input and dictating what is happening based on it.
			ifAddingTask(listItem, input);
			//Having user input desired task to mark off as completed.
			ifTaskFinished(listItem, input);


			//Quitting the program. Simple boolean switch to false to break loop.
			
			if (quit(input) == true)
			{
				break;
			}
			
			/* If there was no other valid button entry, alert user that it was invalid, 
			 * and have them input anything to return to main input using fake pause from input prompt.
			 */
			incorrectInput(listItem, input);
			
		}
		
		
	}
	public static String promptUser(Scanner listItem)
	{
		//Need better way to gap between previous input and current.
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("	    Welcome to Task Tracker. \n  \n Type A to add a task or type R to remove a task.\n 	   Type Q to quit");
		System.out.println("\n\n\n\n\n\n\n");
		String input = listItem.next();
		return input;
	}
	
	//If User Says they want to add a task
	public static String ifAddingTask(Scanner listItem, String input)
	{
		if (input.equalsIgnoreCase("A")) 
		{
			//Having user input their desired task to add to list
			System.out.println("Please enter task: ");
			String list = listItem.next();
		
			System.out.println(list);
			return list;
		}
		else
		{
			return ("I don't know how you got here.");
		}
	}
	
	// If User says they want to check off a task
	public static String ifTaskFinished(Scanner listItem, String input)
	{
		if (input.equalsIgnoreCase("R")) 
		{
			System.out.println("Please enter number of task to mark as completed: ");
			String list = listItem.next();
			return list;
		}
		else
		{
			return ("I don't know how you got here.");
		}
	}
	
	public static boolean quit(String input)
	{
		if (input.equalsIgnoreCase("Q")) 
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void incorrectInput(Scanner listItem, String input)
	{
		if(!(input.equalsIgnoreCase("A") || input.equalsIgnoreCase("R") || input.equalsIgnoreCase("Q"))){
			System.out.println("Invalid Entry, please try again. \n Input anything to continue.");
			boolean buttonpressed = false;
			while(buttonpressed == false) {
							
				@SuppressWarnings("unused")
				String anybutton = listItem.next();
				buttonpressed = true;
		}
	}
			
	}
	}
	
