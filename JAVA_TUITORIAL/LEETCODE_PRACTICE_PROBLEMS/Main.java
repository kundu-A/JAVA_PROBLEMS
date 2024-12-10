class Test
{
	public int removeDuplicate(int nums[]){
	int k=0;
	int temp=nums[0];
	for(int i=0;i<nums.length;i++)
	{
		if(temp!=nums[i])
		{
			temp=nums[i];
			nums[i]=nums[i-1];
			nums[++k]=temp;	
		}
	}
	return k+1;
}
}
class Main
{
	public static void main(String args[])
	{
		int nums[]={1,1,2};
		Test ob=new Test();
		int a=ob.removeDuplicate(nums);
		System.out.println(a);
	}
}