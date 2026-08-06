import java.util.Scanner;
class Bike
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO YAMAHA AIRLINES");
		System.out.println("BIKE MODELS ");
		System.out.println("1.WITH GEAR");
		System.out.println("2.WITHOUT GEAR");
		System.out.print("YOUR CHOICE IS  :");
		int choice=sc.nextInt();
		if(choice==1)
		{
				System.out.println("1.PULSAR 125");
		        System.out.println("2.PULSAR 150");
		        System.out.println("3.PULSAR 220");
		        System.out.print("YOUR CHOICE IS  :");
				int menu=sc.nextInt();
				if(menu==1)
				{
				System.out.println("125 BIKE PRICE AROUND $1.1LKH");
					
				}
				else if(menu==2)
				{
				System.out.println("150 BIKE PRICE AROUND $1.6LKH");
					
				}
				else if(menu==3)
				{
				System.out.println("220 BIKE PRICE AROUND $2LKH");
					
				}
				else
				{
				System.out.println("YOUR BUDJET IS NOT ENOUGH");
					
				}
				
				
		}
		else if(choice==2)
		{
			System.out.println("1.RAY ZR");
			System.out.println("2.FASINO");
			System.out.println("3.JUPITER");
		    System.out.print("YOUR CHOICE IS  :");
			
			int menu=sc.nextInt();
			if(menu==1)
			{
				System.out.println("RAY ZR AMOUNT AROUND $78K");
				
			}
			else if(menu==2)
			{
				System.out.println("FASINO AMOUNT AROUND $85K");
				
			}
			else if(menu==3)
			{
				System.out.println("JUPITER AMOUNT AROUND $95K");
				
			}
			else
			{
				System.out.println("EARN MORE TO GET THESE BIKES");
				
			}
			
			
			
			
		}
		else
		{
			System.out.println("HAVE A GREATFUL DAY ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}