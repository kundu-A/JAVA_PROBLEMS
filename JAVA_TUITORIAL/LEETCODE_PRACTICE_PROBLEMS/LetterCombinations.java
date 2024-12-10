import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        String s2="abc",s3="def",s4="ghi",s5="jkl",s6="mno",s7="pqrs",s8="tuv",s9="wxyz";
        String ar[]=new String[9];
        int k=0;
        List<String> ans=new ArrayList<>();
        int a=Integer.valueOf(digits);
        while (a!=0) {
            int ch=a%10;
        switch (ch) {
            case 2:ar[k++]=s2;
            break;
            case 3:ar[k++]=s3;
            break;
            case 4:ar[k++]=s4;
            break;
            case 5:ar[k++]=s5;
            break;
            case 6:ar[k++]=s6;
            break;
            case 7:ar[k++]=s7;
            break;
            case 8:ar[k++]=s8;
            break;
            case 9:ar[k++]=s9;
            break;
            default:
            break;
        }
        }
        return ans;
    }
}

public class LetterCombinations {
    public static void main(String[] args) {
        String digits="23";
        List<String> ans=new ArrayList<>();
        Solution ob=new Solution();
        ans=ob.letterCombinations(digits);


    }
}
