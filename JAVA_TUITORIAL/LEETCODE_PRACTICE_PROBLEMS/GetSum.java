class Solution {
    public int getSum(int a, int b) {
        if(a>=0 && b>=0)
        {
            for(int i=0;i<b;i++)
                a++;
        }
        if(a<0 && b<0){
            for(int i=0;i>b;i--)
                a--;
        }
        if(a>=0 && b<0){
            for(int i=0;i>b;i--)
                a--;
        }
        if(a<0 && b>=0){
            for(int i=0;i<b;i++)
            a++;
        }
        return a;
    }
}

public class GetSum {
    public static void main(String[] args) {
        int a=-12,b=8;
        Solution ob=new Solution();
        System.out.println(ob.getSum(a, b));
    }
}
