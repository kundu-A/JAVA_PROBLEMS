class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
	for(int i=0;i<nums.length;i++)
	{
		if(target==nums[i])
		{
			ans[0]=i;
			break;
		}
	}
	for(int i=nums.length-1;i>=0;i--)
	{
		if(target==nums[i])
		{
			ans[1]=i;
			break;
		}
	}
	return ans;
    }
}
class SearchRange
{
	public static void main(String args[])
	{
		int nums[]={};
		int target=0;
		Solution ob=new Solution();
		int ans[]=ob.searchRange(nums,target);
		for(int i=0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
	}
}