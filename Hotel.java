import java.util.Scanner;
class Hotel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("********** welcome to abc hotel***************");
		System.out.println("our menu is ");
		System.out.println("1.veg");
		System.out.println("2.nonveg");
		System.out.print("choose any one option  :");
		int choice=sc.nextInt();
		if(choice==1)
		{
				System.out.println("1.panner briyani");
		        System.out.println("2.veg meals");
		        System.out.println("3.chappathi");
		        System.out.print("choose any one item  :");
				int menu=sc.nextInt();
				if(menu==1)
				{
				System.out.println("panner briyani price is $200");
					
				}
				else if(menu==2)
				{
				System.out.println("veg meals  price is $100");
					
				}
				else if(menu==3)
				{
				System.out.println("chappathi  price is $50");
					
				}
				else
				{
				System.out.println("no dishesssss");
					
				}
				
				
		}
		else if(choice==2)
		{
			System.out.println("1.mutton briyani");
			System.out.println("2.chicken fried rice");
			System.out.println("3.chicken 65");
		    System.out.print("choose any one item  :");
			
			int menu=sc.nextInt();
			if(menu==1)
			{
				System.out.println("mutton briyani price is $300");
				
			}
			else if(menu==2)
			{
				System.out.println("chicken fried price is $150");
				
			}
			else if(menu==3)
			{
				System.out.println("chicken 65 price is $120");
				
			}
			else
			{
				System.out.println("no dishesssss");
				
			}
			
			
			
			
		}
		else
		{
			System.out.println("we only have veg and non veg ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}