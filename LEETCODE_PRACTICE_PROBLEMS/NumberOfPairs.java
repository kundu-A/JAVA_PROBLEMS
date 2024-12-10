class Solution {
    public int[] numberOfPairs(int[] nums) {
	int operation=0,leftover=0;
	int ans[]=new int[2];
     	for(int i=0;i<nums.length;i++)
	{
		if(nums[i]!=-1){
		int c=1;
		for(int j=i+1;j<nums.length;j++)
		{
			if(nums[i]==nums[j])
			{
				nums[j]=-1;
				c++;
			}
		}
		operation=operation+(c/2);
		leftover=leftover+(c%2);

		}
	}
	ans[0]=operation;
	ans[1]=leftover;
	return ans;
    }
}
class NumberOfPairs
{
	public static void main(String args[])
	{
		int nums[]={0};
		Solution ob=new Solution();
		int ar[]=ob.numberOfPairs(nums);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
	}
}