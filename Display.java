class  Display
{
	public static void main(String[] args)
	{
		int[] sample=new int [9];
		sample[0]=23;
		sample[1]=24;
		sample[2]=56;
		sample[3]=21;
		sample[4]=89;
		sample[5]=12;
		sample[6]=33;
		sample[7]=98;
		sample[8]=03;
		
		
		for(int i=0;i<sample.length;i++)
		{
			System.out.println("you entered "+ sample[i]);
			if(sample[i]%2==0)
			{
			System.out.println("even number "+ sample[i]);
				
			}
			else
			{
			System.out.println("odd number "+ sample[i]);
				
			}
		}
	}
}