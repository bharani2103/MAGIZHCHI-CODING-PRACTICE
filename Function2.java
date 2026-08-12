class Function2
{
	public static void main(String[] args)
	{
		Function2 f=new Function2();
		String res=f.name();
		System.out.println(f.name());
		
		System.out.println(f.add(10));
		System.out.println(f.plus());	
		
	}
	
	String name()
	{
		String s="welcome";
		return s;
	}
	
	int add(int a)
	{
		
		return a+10;
	}
	int plus(int a,int b)
	{
		return a+b;
		
	}
	
}