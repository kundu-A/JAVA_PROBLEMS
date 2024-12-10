class Solution {
    public String reverseWords(String s) {
        s=" "+s;
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            int a=0,b=0;
            if(s.charAt(i)!=' '){
                 a=i;
            for(int j=i;j>=0;j--){
                if(s.charAt(j)==' '){
                    i=j;
                    b=j+1;
                    break;
                }
            }
            ans=ans+s.substring(b,a+1)+" ";
        }
        }
        return ans.trim();
    }
}

public class ReverseWords {
    public static void main(String[] args) {
        //String s = "the sky is blue";
        //String s ="EPY2giL";
        String s = "a good   example";
        Solution ob=new Solution();
        System.out.println(ob.reverseWords(s));

    }
}
