class Solution {
    public int minimumSum(int[] nums) {
        int  min=Integer.MAX_VALUE;
        System.out.println(min);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]<nums[j] && nums[k]<nums[j])
                    {
                        int sum=(nums[i]+nums[j]+nums[k]);
                        if(min>sum)
                        min=sum;
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        else
        return min;
    }
}
public class MinimumSum {
    public static void main(String[] args) {
        int nums[]={8,6,1,5,3};
        Solution ob=new Solution();
        System.out.println(ob.minimumSum(nums));
    }
}
