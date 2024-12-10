/*
 * Problem no. - 169
 */

public class MejorityElements {
    public static void main(String[] args) {
        int nums[]={6,5,5};
        System.out.println(new Solution().majorityElement(nums));
    }
}
class Solution {
    public int majorityElement(int[] nums) {
    int c=0,v=0,max=-1;
    for(int i=0;i<nums.length;i++){
        c=1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j])
                c++;
        }
        if(max<c){
            max=c;
            v=nums[i];
        }
    }
    return  v;
    }
}
