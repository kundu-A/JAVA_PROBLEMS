class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0)
            return false;
        if(n==1)
            return true;
        if(n%2==0){
            int flag=0;
            for(int i=0;i<n;i++){
                if(Math.pow(2, i)==n){
                    flag=1;
                    break;
                }
                if(Math.pow(2, i)>n)
                    break;
            }
            if(flag==1)
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
class IsPowerOfTwo{
    public static void main(String[] args) {
        int n=-2147;
        Solution ob=new Solution();
        System.out.println(ob.isPowerOfTwo(n));
    }
}