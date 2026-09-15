package javaapplication17;

import java.util.Scanner;

class Institution {

    String institutionName = "ABC Institution";

    class Student {

        String studentName;
        int rollNo;
        int[] marks;
        double average;
        char grade;

        void addStudent(Scanner sc) {

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Roll No: ");
            rollNo = sc.nextInt();

            System.out.print("Enter Number of Subjects: ");
            int n = sc.nextInt();

            marks = new int[n];
        }

        void addMarks(Scanner sc) {

            System.out.println("Enter Marks:");

            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
            }
        }

        void calculateGrade() {

            int sum = 0;

            for (int i = 0; i < marks.length; i++) {
                sum = sum + marks[i];
            }

            average = (double) sum / marks.length;

            if (average >= 90) {
                grade = 'A';
            } else if (average >= 75) {
                grade = 'B';
            } else if (average >= 50) {
                grade = 'C';
            } else {
                grade = 'F';
            }
        }

        void display() {

            System.out.println("\nInstitution Name: " + institutionName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll No: " + rollNo);

            System.out.print("Marks: ");

            for (int i = 0; i < marks.length; i++) {
                System.out.print(marks[i] + " ");
            }

            System.out.printf("\nAverage: %.2f", average);
            System.out.println("\nGrade: " + grade);
        }
    }
}

public class JavaApplication17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Institution obj = new Institution();
        Institution.Student student = obj.new Student();

        int choice;

        do {

            System.out.println("\n1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    student.addStudent(sc);
                    break;

                case 2:
                    student.addMarks(sc);
                    break;

                case 3:
                    student.calculateGrade();
                    break;

                case 4:
                    student.display();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}