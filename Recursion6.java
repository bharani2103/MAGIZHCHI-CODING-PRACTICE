class Recursion6
{
	public static void main(String[] args)
	{
		int arr[]={5,10,15,20,25,30};
		int key=20;
		int left=0;
		int right=arr.length-1;

		Recursion6 r=new Recursion6();
		int value=r.element(arr,key,left,right);

		System.out.println(value);
	}

	int element(int arr[],int key,int left,int right)
	{
		if(left>right)
		{
			return -1;
		}

		int mid=(left+right)/2;

		if(arr[mid]==key)
		{
			return mid;
		}

		if(arr[mid]<key)
		{
			return element(arr,key,mid+1,right);
		}
		else
		{
			return element(arr,key,left,mid-1);
		}
	}
}