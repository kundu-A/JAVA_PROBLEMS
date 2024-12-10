//Leetcode 2815: Max Pair Sum in an Array
class Solution {
    public int maxSum(int[] nums) {
        int ar[]=new int[nums.length];
	int finalMax=-1;
	for(int i=0;i<nums.length;i++)
	{
		int t=nums[i];
		int max=-1;
		while(t>0)
		{
			int a=t%10;
			if(max<a)
				max=a;
			t=t/10;
		}
		ar[i]=max;
	}
	for(int i=0;i<ar.length;i++)
	{
		int a=0;
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]==ar[j])
				a=nums[i]+nums[j];
			if(finalMax<a)
				finalMax=a;
		}
	}
	if(finalMax==0)
		return -1;
	else
		return finalMax;
    }
}
class MaxSum
{
	public static void main(String args[])
	{
		int nums[]={1,2,3,4};
		Solution ob=new Solution();
		System.out.println(ob.maxSum(nums));
	}
}