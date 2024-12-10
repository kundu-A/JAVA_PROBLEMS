/**
 * Problem No. -  136
 */
public class SingleNumber {

    public static void main(String[] args) {
        int nums[]={2,2,3,2};
        System.out.println(new Solution().singleNumber(nums));
    }
}
class Solution {
    int c=-1,v=0;
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[nums.length-1];
        else{
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=000){
            c=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=000;
                    c++;
                }
            }
        }
            if(c==1){
                v=nums[i];
                break;
            }
        }
        return  v;
    }
}
}