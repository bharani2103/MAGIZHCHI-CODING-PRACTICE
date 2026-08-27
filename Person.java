class Person
{
    String name;
    int age;
}

class Student extends Person
{
    int rollNo;
    int marks;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args)
    {
        Student s = new Student();

        s.name = "Bharani";
        s.age = 20;
        s.rollNo = 101;
        s.marks = 85;

        s.display();
    }
}