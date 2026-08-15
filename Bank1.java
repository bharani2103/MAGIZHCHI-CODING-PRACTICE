class Bank1
{
	double Deposit;
	double Withdraw;
	double Balance;
	public static void main(String[] args)
	{
		Bank1 b=new Bank1();
		b.Deposit=10000;
		b.Withdraw=5000.98;
		b.Balance=b.Deposit-b.Withdraw;
		System.out.println("DEPOSIT : "+ b.Deposit);
		System.out.println("WITTHDRAW : "+ b.Withdraw);
		System.out.println("BALANCE : "+ b.Balance);
		
		System.out.println("EXIT");
		
	}

}