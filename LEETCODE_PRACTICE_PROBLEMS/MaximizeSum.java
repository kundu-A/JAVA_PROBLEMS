//Leetcode 2656: Maximum sum with exactly k elements.
class Solution
{
	public int maximizeSum(int nums[],int k)
	{
		int max=-1;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max)
				max=nums[i];
		}
		int add=0;
		while(k!=0)
		{
			add=add+max;
			max++;
			k--;
		}
		return add;
	}
}
class MaximizeSum
{
	public static void main(String args[])
	{
		int nums[]={5,5,5};
		int k=2;
		Solution ob=new Solution();
		System.out.println(ob.maximizeSum(nums,k));
	}
}