import java.util.Scanner;
class Marks1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter mark 1 :");
	int mark1=sc.nextInt();
	System.out.print("Enter mark 2 :");
	int mark2=sc.nextInt();
	System.out.print("Enter mark 3 :");
	int mark3=sc.nextInt();
	Marks1 m=new Marks1();
	int Total=m.total(mark1,mark2,mark3);
	System.out.println(Total);
	Marks1 a=new Marks1();
	System.out.println(a.average(mark1,mark2,mark3));
	Marks1 g=new Marks1();
	System.out.println(g.grade(mark1,mark2,mark3));
	
	
	
	
	}
	int total(int a,int b,int c)
	{
		return a+b+c;
	}
	int average(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
	int grade(int a,int b,int c)
	{
		if(a+b+c>=80)
		{
			System.out.println("A");
			
		}
		else if(a+b+c<=79 && a+b+c>=45)
		{
			System.out.println("B");
			
		}
		else
		{
			System.out.println("c");
			
		}
		return a+b+c;
		
	}
	
}