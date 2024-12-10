import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
	for(int i=0;i<nums.length-1;i++)
	{
		if(nums[i]==nums[i+1])
			return true;
	}
	return false;
    }
}
class ContainsDuplicate
{
	public static void main(String args[])
	{
		int nums[]={1,2,3,4};
		Solution ob=new Solution();
		System.out.println(ob.containsDuplicate(nums));
	}

}