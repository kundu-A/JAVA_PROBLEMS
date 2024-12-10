class Solution {
    public int missingNumber(int[] nums) {
		int flag=0,pos=0;
		for(int i=0;i<nums.length+1;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				flag=0;
				if(i==nums[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				pos=i;
				break;
			}
		}
		return pos;
    }
}
public class MissingNUmberSolution
{
	public static void main(String args[])
	{
		int nums[]={9,6,4,2,3,5,7,0,1};
		Solution ob=new Solution();
		int a=ob.missingNumber(nums);
		System.out.println(a);
	}
}