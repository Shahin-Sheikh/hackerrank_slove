import java.util.*;

public class Employee
{
  String name;
	double salary, enteredDoub;
	int enteredNum;
	Scanner console = new Scanner(System.in);

	// Employee() Construction taking in arguments to set name and salary
	Employee(String n, double s)
	{
		name = n;
		salary = s;
		System.out.printf("\nThe Employee's name is %s and their salary is $%.2f a year.\n\n",name, salary);
	}

	// Empty constructor method in order to make empty Employee Object
	Employee()
	{}

	// Allows to changes salary by taking an amount argument from user input
	// referenced in the Program class switch statement
	void salary_change(double amount)
	{
		// Set variable salary to the salary in the ArrayList by calling method getSalary()
		salary = getSalary();
		salary += amount;

		System.out.printf("%s's salary has been changed to $%.2f.", this.getEmployeeName(), this.getSalary());
	}
	// Sets salary to 00.000 and prints to the screen
	void quit(ArrayList<Employee> emp)
	{
		int empNum;
		System.out.print("Enter Employee # whos salary do you want to set to $00.00: ");
		empNum = checkInt();

		if (empNum > emp.size())
		{
			System.out.println("Not a Valid Employee ID! Press 3 for Employee List.");
		}
		else
		{
			empNum -= 1;
			// sets variable amount to the negative amount of Employee's current salary
			// then runs the amount through the salary_change(amount) method to get a salary of 00.00
			double amount = -emp.get(empNum).getSalary();
			emp.get(empNum).salary_change(amount);
		}				
	}
	// Prints current name and salary to the screen
	void get_info(ArrayList<Employee> emp)
	{
		//Get all Employee Information
		int j=0;
		System.out.println("All the employee information is:");
		for(Employee employee: emp)
		{
			System.out.println("#"+ (j + 1) + ": " + employee);
			j++;
		}
	}

	void change_status()
	{
		getEmployeeName();
		System.out.printf("Cannot change %s's status because they are a normal Employee.\n", name);
	}

	// Used to access arrayList salary
	double getSalary()
	{
		return salary;
	}

	// used to get the name from the arralist
	String getEmployeeName()
	{
		return name;
	}


	// Override the toString() method to be able to print all Arraylist objects
	public String toString() 
	{
        return ("Employee's Name: "+this.getEmployeeName()+ "    Salary: $"+ this.getSalary());
    }

    void create_new(ArrayList<Employee> emp)
    {
    	int empNum, rank, category, emptype;
    	double sa;
    	String na;
    	// Propts user for how many employees and checks for compatible data type
		System.out.print("How many Employee's would you like to create?:");
		empNum = checkInt();
    	// Creating each object to add the object array while checking for compatible data types
		for(int i = 0; i < empNum; i++)
		{
			System.out.println("\nWhat type of Employee would you like to create?");
			System.out.print("Enter 1 for Employee, 2 for Faculty, 3 for Staff: ");

			emptype = checkIntRange();

			switch(emptype)
			{
				case 1:
				{
					System.out.printf("What is Employee Name?: ");
					na = console.next();
					System.out.printf("\nWhat is %s's Salary?: ", na);
					sa = checkDouble();
					emp.add(new Employee(na,sa));
					break;	
				}

				case 2:
				{
					System.out.printf("What is the Faculty Member's Name?: ");
					na = console.next();
					System.out.printf("\nWhat is %s's Salary?: ", na);
					sa = checkDouble();

					System.out.print("\nSelect Faculty member's rank: 1 for Assistant Professor, 2 for Associate Professor, 3 for Professor: ");
					rank = checkIntRange();
					emp.add(new Faculty(na,sa,rank));
					break;
				}

				case 3:
				{
					System.out.printf("What is the Staff Member's Name?: ");
					na = console.next();
					System.out.printf("\nWhat is %s's Salary?: ", na);
					sa = checkDouble();

					System.out.print("\nSelect Staff Category: 1 for full-time or 2 for part-time: ");
					category = checkIntRange2();
					emp.add(new Staff(na,sa,category));
					break;
				}				
			}			
		}
    }

     

	public int checkInt()
	{
		do {
			while(!console.hasNextInt())
			{
				System.out.println("That is not a number!");
				console.next();
			}
			enteredNum = console.nextInt();
		}while (enteredNum <= 0);

		return enteredNum;
	}

	public int checkIntRange()
	{
		do {
			while(!console.hasNextInt())
			{
				System.out.println("That is not a number!");
				console.next();
			}
			enteredNum = console.nextInt();
		}while (enteredNum < 1 || enteredNum > 3);

		return enteredNum;
	}

	public int checkIntRange2()
	{
		do {
			while(!console.hasNextInt())
			{
				System.out.println("That is not a number!");
				console.next();
			}
			enteredNum = console.nextInt();
		}while (enteredNum < 1 || enteredNum > 2);

		return enteredNum;
	}

	public double checkDouble()
	{
		do {
			while(!console.hasNextDouble())
			{
				System.out.println("That is not a number!");
				console.next();
			}
			 enteredDoub = console.nextDouble();
		}while (enteredDoub <= 0);

		return enteredDoub;
	}   
}