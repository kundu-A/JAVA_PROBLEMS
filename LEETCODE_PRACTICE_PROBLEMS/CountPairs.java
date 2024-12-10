//Leetcode 2824: Count pairs whose Sum is less than target.
import java.util.ArrayList;
import java.util.List;
class Solution
{
	public int countPairs(List<Integer> nums,int target)
	{
		int ar[]=new int[nums.size()];
		for(int i=0;i<nums.size();i++)
		{
			ar[i]=nums.get(i);
		}
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if((ar[i]+ar[j])<target)
				c++;
			}
		}
		return c;
	}
}
class CountPairs
{
	public static void main(String args[])
	{
		List<Integer> nums=List.of(-1,1,2,3,1);
		int target=2;
		Solution ob=new Solution();
		System.out.println(ob.countPairs(nums,target));
	}
}