class Solution {
    public int maximumValue(String[] strs) {
        int max=-1;
        for(int i=0;i<strs.length;i++){
            int a=0;
        try {
           a=Integer.parseInt(strs[i]);
           if(max<a)
                max=a;
            
        } catch (Exception e) {
            int l=strs[i].length();
            if(max<l)
                 max=l;
        }
        }
        return max;
    }
}
public class MaximumValue {
    public static void main(String[] args) {
        String strs[]={"1","01","001","0001"};
        Solution ob=new Solution();
        System.out.println(ob.maximumValue(strs));
    }
}
