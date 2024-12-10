class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        else
        {
            int a=0,b=1,c=0;
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }
}

public class Fib {
    public static void main(String[] args) {
        int n=6;
        Solution ob=new Solution();
        System.out.println(ob.fib(n));
    }
}
