class Solution {
    public int searchInsert(int[] nums, int target) {
	int pos=0;
        for(int i=0;i<nums.length;i++)
	{
		if(target==nums[i])
		{
			pos=i;
			break;
		}
		else
		{
			if(nums[nums.length-1]<target){
				pos=nums.length;
				break;
			}
			if(nums[0]>target){
				pos=0;
				break;
			}
			else
			{
				if(nums[i]<target && nums[i+1]>target){
					pos=i+1;
					break;}
			}
		}
	}
	return pos;
    }
}
class SearchInsert
{
	public static void main(String args[])
	{
		int nums[]={1,3,5,6};
		int target=5;
		//int target=7;
		//int target=3;
		Solution ob=new Solution();
		System.out.println(ob.searchInsert(nums,target));
	}
}