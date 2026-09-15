abstract class Employee
{
	string name;
	Employee(string name)
	{
		this.name=name;
	}
		void displayEmployee()
    {
        System.out.println("Employee Name: " + name);
    }
}