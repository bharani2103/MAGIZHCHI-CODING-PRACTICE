class Book
{
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    Book(int bookId, String title, String author)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    void display()
    {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

        if(isAvailable)
            System.out.println("Availability: Available");
        else
            System.out.println("Availability: Borrowed");

        System.out.println();
    }

 
    void borrowBook()
    {
        if(isAvailable)
        {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        }
        else
        {
            System.out.println(title + " is already borrowed.");
        }
    }


    void returnBook()
    {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}

class Library
{
    public static void main(String[] args)
    {
       
        Book b1 = new Book(101, "Java Programming", "James");
        Book b2 = new Book(102, "Python Basics", "Guido");
        Book b3 = new Book(103, "Data Structures", "Mark");

        b1.display();
        b2.display();
        b3.display();

        b1.borrowBook();
        b1.borrowBook();

        b1.returnBook();

        b1.display();
    }
}