import java.util.ArrayList; 
public class Faculty extends Employee
{
  String name;
	double salary;
	String rank;

	Faculty(String n, double s, int r)
	{
		name = n;
		salary = s;

		switch(r)
		{
			case 1:
			{
				rank = "Assistant Professor";
				break;
			}

			case 2:
			{
				rank = "Associate Professor";
				break;
			}

			case 3:
			{
				rank = "Professor";
				break;
			}
		}

		System.out.printf("\n%s is a Faculty member that is a %s and makes $%.2f a year \n\n", name, rank, salary);
	}
	Faculty()
	{}

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

	// Will change the rank of the employee based on the users desired input
	void change_status()
	{
		
		System.out.printf("%s's is a currently a %s. What would you like to change their rank to?\n", name, rank);
		System.out.print("\nSelect Faculty member's rank: 1 for Assistant Professor, 2 for Associate Professor, 3 for Professor: ");
		int r = checkIntRange();
		//Runs switch statement in order to change rank
		switch(r)
		{
			case 1:
			{
				rank = "Assistant Professor";
				break;
			}

			case 2:
			{
				rank = "Associate Professor";
				break;
			}

			case 3:
			{
				rank = "Professor";
				break;
			}
		}
		System.out.printf("\n%s is now a %s", name, rank);
		
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

	String getRank()
	{
		return rank;
	}

	// Override the toString() method to be able to print all Arraylist objects
	public String toString() 
	{
        return ("Faculty Member's Name: "+ getEmployeeName()+ "    Salary: $"+ getSalary() + "    Rank: " + this.getRank());
    }

}
