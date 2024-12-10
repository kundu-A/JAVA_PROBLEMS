class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0,k=0;
        int ans[]=nums;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]==val)
                c++;
            else
                nums[k++]=nums[i];
        }
        return (nums.length-c);
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
        Solution ob=new Solution();
        System.out.println(ob.removeElement(nums, val));
    }
}
