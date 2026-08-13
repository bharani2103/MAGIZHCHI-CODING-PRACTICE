import java.util.Scanner;
class Bank
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("ENTER THE AMOUNT YOU WANT TO DEPOSIT : ");
	int amount=sc.nextInt();
	Bank d=new Bank();
	int dep=d.Deposit(amount);
	System.out.println("YOU DEPOSITED : "+dep);
	System.out.print("ENTER THE AMOUNT YOU WANT TO WITHDRAW : ");
	int draw=sc.nextInt();
	Bank w=new Bank();
	int with=w.Withdraw(draw);
	{
	if(dep<with)
	{
	System.out.println("you deposit lesser amount ");
	}
	else
	{
	System.out.println("YOU WITHDRAW : "+with);
	}
	}
	
	int bal=dep-with;
	Bank u=new Bank();
	int ba=u.balance(bal);
	System.out.println("Your balance is : "+ ba);
	
	
	}
	

	int Deposit(int a)
	{
		return a;
	}
	int Withdraw(int a)
	{
		return a;
	}
	int balance(int a)
	{
		return a;
	}
}