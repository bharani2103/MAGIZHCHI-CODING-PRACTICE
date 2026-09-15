class Fulltime extends Employee
{
	double salary;
	FullTimeEmployee(String name, double monthlySalary)
    {
        
        this.monthlySalary = monthlySalary;
    }
	 void calculateSalary()
    {
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}