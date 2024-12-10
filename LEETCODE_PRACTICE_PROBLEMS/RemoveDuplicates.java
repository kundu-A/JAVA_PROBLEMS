class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
            return nums.length;
        int k=2;
        for(int i=2;i<nums.length;i++){
            if( nums[i]!=nums[k-2] ){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}

class RemoveDuplicates{
    public static void main(String[] args) {
        int nums[]={1,1,3};
        Solution ob=new Solution();
        int a=(ob.removeDuplicates(nums));
        for(int i=0;i<a;i++)
            System.out.print(nums[i]);
    }
}