class  Newkeyword
{
	public static void main(String[] args)
	{
		int[] sample=new int [3];
		sample[0]=4;
		sample[1]=6;
		sample[2]=10;
		int sum=0;
		for(int i=sample.length-1;i<=2;i++)
		{
			
			sum+=sample[i];
			System.out.println(sum);
			
		}
	}
}