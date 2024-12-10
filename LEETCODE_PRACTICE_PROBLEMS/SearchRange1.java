class Solution {
    public int[] searchRange(int[] nums, int target) {
	int ans[]={-1,-1};
	for(int i=0;i<nums.length;i++)
	{
		if(ans[0]==-1 && target==nums[i])
			ans[0]=i;
		if(ans[1]==-1 && target==nums[nums.length-1-i])
			ans[1]=nums.length-1-i;
		if(ans[0]!=-1 && ans[1]!=-1)
			break;
	}
	return ans;
}
}
class SearchRange1
{
	public static void main(String args[])
	{
		int nums[]={5,7,7,8,8,10};
		int target=8;
		Solution ob=new Solution();
		int ans[]=ob.searchRange(nums,target);
		for(int i=0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
	}
}