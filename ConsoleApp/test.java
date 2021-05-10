import java.util.*;

public class test
{
  //Method to access the menu and print it to the console
	static void view_menu()
	{

		System.out.println("\n\n-------------------------------------");
        System.out.println("|    Employee Interaction Menu      |");
        System.out.println("|-----------------------------------|");
        System.out.println("|                                   |");
        System.out.println("|   Select number and press enter   |");
        System.out.println("|       to perform operation        |");
        System.out.println("|-----------------------------------|");
        System.out.println("|                                   |");
        System.out.println("| 1.) Create New Employee           |");
        System.out.println("| 2.) Increase or Decrease Salary   |");
        System.out.println("| 3.) Display All Information       |");
        System.out.println("| 4.) Set Salary to $00.00          |");
        System.out.println("| 5.) Show Menu Options             |");
        System.out.println("| 6.) Change Status                 |");
        System.out.println("| 7.) Exit Program!                 |");
        System.out.println("|                                   |");
        System.out.println("-------------------------------------");
	}

	static Scanner console = new Scanner(System.in);

	public static void main(String args[])
	{
		Employee mEmployee = new Employee();
		boolean programOn = true;
		int userMenuOption = 0;
		int empNum;

		// Creates an Object Arraylist based on number of employees to create
		ArrayList<Employee> emp = new ArrayList<Employee>();

		mEmployee.create_new(emp);

		// Call view_menu() method to display menu on screen
		view_menu();

		
		while(programOn)
		{
			// Prompt and accept menu options and execute them in the switch statement
			System.out.print("\nSelect a menu option (5 for list options): ");
			System.out.println();
			userMenuOption = mEmployee.checkInt();
			
			switch(userMenuOption)
			{
				case 1:
				{
					// Call the creat_new()method with emp ArrayList as argument
					mEmployee.create_new(emp);
					break;
				}

				case 2:
				{
					Double amount;
					// Ask user which employee they want to change while checking for valid data entry
					System.out.print("Enter Employee # whos salary do you want to change: ");
					empNum = mEmployee.checkInt();
		
					// Checks to see if the number enter is a valid ID by comparring length of 
					// Arraylist to the number enter
					if (empNum > emp.size())
					{
						// If not valid inform User while giving them option to display list
						System.out.println("Not a Valid Employee ID! Press 3 for Employee List.");
						break;
					}			
					else
					{
						// If valid decrease number by one for accurate array position
						empNum -= 1;

						// Ask amount user wants to adjust salary by and check for valid input
						System.out.print("Enter amount to adjust salary: ex. (-100) for decrease and (100) for increase: ");
						amount = mEmployee.checkDouble();
					}

					//Takes the valid arraylist number and returns that object then runs 
					// the salary_change(amount) method on that object with amount entered above
					emp.get(empNum).salary_change(amount);

					break;
				}

				case 3:
				{
					// call the get_info() method with emp ArrayList as argument
					mEmployee.get_info(emp);
					break;
				}
				case 4:
				{
					// call the quit() method with emp ArrayList as argument
					mEmployee.quit(emp);
					break;
				}
				case 5:
				{
					// Display menu on screen
					view_menu();
					break;
				}

				case 6:
				{
					System.out.print("Enter Employee # whos status you want to change: ");
					empNum = mEmployee.checkInt();
		
					// Checks to see if the number enter is a valid ID by comparring length of 
					// Arraylist to the number enter
					if (empNum > emp.size())
					{
						// If not valid inform User while giving them option to display list
						System.out.println("Not a Valid Employee ID! Press 3 for Employee List.");
						break;
					}			
					else
					{
						// If valid decrease number by one for accurate array position
						empNum -= 1;
						emp.get(empNum).change_status();
						
					}
					break;
				}

				case 7:
				{
					// Set programOn Boolean to false to end loop and exit program
					System.out.println("Program Exited!");
					programOn = false;
					break;
				}
			}
		}
	}
}
