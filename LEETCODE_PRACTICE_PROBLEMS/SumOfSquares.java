//Leetcode 2778: Sum of squares of Special Elements.
class Solution
{
	public int sumOfSquares(int[] nums)
	{
		int l=nums.length;
		int p=1,add=0;
		for(int i=0;i<l;i++)
		{
			if(l%(i+1)==0)
			{
				p=nums[i]*nums[i];
				add=add+p;
				p=1;
			}
		}
		return add;
	}
}
class SumOfSquares
{
	public static void main(String args[])
	{
		int nums[]={2,7,1,19,18,3};
		Solution ob=new Solution();
		int a=ob.sumOfSquares(nums);
		System.out.println(a);
	}
}