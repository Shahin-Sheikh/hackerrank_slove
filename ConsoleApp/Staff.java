import java.util.*;

public class Staff extends Employee
{
  String name;
	double salary;
	String category;

	Staff(String n, double s, int c)
	{
		name = n;
		salary = s;

		switch(c)
		{
			case 1:
			{
				category = "Full-Time";
				break;
			}
			case 2:
			{
				category = "Part-Time";
				break;
			}
		}
		System.out.printf("\n%s is a Staff member that is %s and makes $%.2f a year \n\n", name, category, salary);
	}

	Staff()
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

	// Will change the category of the Employee
	void change_status()
	{
		System.out.printf("%s's is a currently a %s. What would you like to change their category to?\n", name, category);
		System.out.print("\nSelect Staff Category: 1 for full-time or 2 for part-time: ");
		int c = checkIntRange();


		switch(c)
		{
			case 1:
			{
				category = "Full-Time";
				break;
			}
			case 2:
			{
				category = "Part-Time";
				break;
			}
		}

		System.out.printf("\n%s is now a %s", name, category);
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

	String getCategory()
	{
		return category;
	}

	// Override the toString() method to be able to print all Arraylist objects
	public String toString() 
	{
        return ("Staff Member's Name: "+this.getEmployeeName()+ "    Salary: $"+ this.getSalary() + "    Category: " + this.getCategory());
    }
}