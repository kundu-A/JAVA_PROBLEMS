class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length()-1,pos=0,c=0;
        for(int i=l;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                pos=i;
                break;
            }
        }
        for(int i=pos;i>=0;i--)
        {
            if(s.charAt(i)==' ')
                break;
            else
                c++;

        }
        return c;
        
    }
}
class LengthOfLastWord
{
    public static void main(String[] args) {
     Solution ob=new Solution();
    int a=ob.lengthOfLastWord("Hello worl  ");
    System.out.println(a);
    }
}