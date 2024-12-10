class Solution {
    public void rotate(int[] nums, int k) {
        int temp[]=new int[nums.length];
        if (nums.length==1 || nums.length==k) {
            nums=nums;
        }
        else if(nums.length<k){
            k=k-nums.length;
            int pos=0;
        for(int i=nums.length-k;i<nums.length;i++)
            temp[pos++]=nums[i];
        for(int i=0;i<nums.length-k;i++)
            temp[pos++]=nums[i];
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
        }
    }
        else{
            int pos=0;
        for(int i=nums.length-k;i<nums.length;i++)
            temp[pos++]=nums[i];
        for(int i=0;i<nums.length-k;i++)
            temp[pos++]=nums[i];
        for(int i=0;i<temp.length;i++){
            nums[i]=temp[i];
            System.out.print(nums[i]+" ");
        }
    }

    }
}
public class Rotate1 {
    public static void main(String[] args) {
        int nums[]={1,2};
        Solution ob=new Solution();
        ob.rotate(nums, 5);
    }
}
