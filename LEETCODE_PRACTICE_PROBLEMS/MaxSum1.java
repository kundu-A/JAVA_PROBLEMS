//Leetcode 2815: Max Pair Sum in an Array

class Solution {
    public int maxSum(int[] nums) {
	int finalMax=-1;
	for(int i=0;i<nums.length;i++)
	{
		int t=nums[i],max=-1;
		while(t>0)
		{
			int a=t%10;
			if(max<a)
				max=a;
			t=t/10;
		}
		for(int j=i+1;j<nums.length;j++)
		{
			int t1=nums[j],max1=-1;
			while(t1>0)
			{
				int a=t1%10;
				if(max1<a)
				max1=a;
				t1=t1/10;
			}
			int a=0;
			if(max==max1)
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
class MaxSum1
{
	public static void main(String args[])
	{
		int nums[]={51,17,71,42,24};
		Solution ob=new Solution();
		System.out.println(ob.maxSum(nums));
	}
}