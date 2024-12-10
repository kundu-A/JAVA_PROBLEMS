//Leetcode 2733: Neither Minimum or Maximum.
class Solution
{
	public int findNonMinOrMax(int nums[])
	{
		int a=0,max=-1,min=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max)
				max=nums[i];
			if(nums[i]<min)
				min=nums[i];
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>min && nums[i]<max)
			{
				a=nums[i];
				break;
			}
			else
				a=-1;
		}
		return a;
	}
}
class FindNonMinOrMax
{
	public static void main(String args[])
	{
		int nums[]={2,1,3};
		Solution ob=new Solution();
		System.out.println(ob.findNonMinOrMax(nums));
	}
}