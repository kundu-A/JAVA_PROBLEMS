class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
	for(int i=0;i<nums.length-1;i++)
	{
		int flag=0;
		for(int j=i+1;j<nums.length;j++)
		{
			if(nums[i]+nums[j]==target)
			{
				flag=1;
				ans[0]=i;
				ans[1]=j;
				break;
			}
		}
		if(flag==1)
			break;
	}
	return ans;
    }
}
class TwoSum
{
	public static void main(String args[])
	{
		int nums[]={3,3};
		int target=6;
		Solution ob=new Solution();
		int ar[]=ob.twoSum(nums,target);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}