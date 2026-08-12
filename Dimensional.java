class Dimensional
{
	public static void main(String[] args)
	{
		int[][] num1=new int[2][2];
		int[][] num2=new int[2][2];
		num1[0][0]=1;
		num1[0][1]=2;
		num1[1][0]=3;
		num1[1][1]=4;
		num2[0][0]=5;
		num2[0][1]=6;
		num2[1][0]=7;
		num2[1][1]=8;
		int sum=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				System.out.println(num1[i][j]+num2[i][j]+" ");
				
			}
		}
		
		
		
		
	}
}