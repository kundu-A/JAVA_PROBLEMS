/*
 * Problem No. - 20
 */
public class ValidParanthesis {
    public static void main(String[] args) {
        String s="()";
        System.out.println(new Solution().isValid(s));
    }
}
class Solution {
    public boolean isValid(String s) {
        int a=s.indexOf("()");
        int b=s.indexOf("{}");
        int c=s.indexOf("[]");
        if(a==1 || b==1 || c==1)
            return true;
        else
            return false;
    }
}
