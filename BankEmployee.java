class BankEmployee
{
    String name;
}

class Employee extends Person
{
    int salary;
}

class Manager extends Employee
{
    String department;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args)
    {
        Manager m = new Manager();

        m.name = "Bharani";
        m.salary = 50000;
        m.department = "IT";

        m.display();
    }
}