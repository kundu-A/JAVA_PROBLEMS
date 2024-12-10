class Solution {
    public int[] plusOne(int[] digits) {
        String s="";
        for(int i=0;i<digits.length;i++)
        {
            s=s+String.valueOf(digits[i]);
        }
        System.out.println(s);
        long sum=1;
        sum=(long)sum+Long.parseLong(s);
        s=String.valueOf(sum);
        int ans[]=new int[s.length()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return ans;
    }
}

class PlusOne
{
    public static void main(String[] args) {
        int digits[]={9,8,7,6,5,4,3,2,1,0};
        Solution ob=new Solution();
        int ans[]=ob.plusOne(digits);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
}