class Solution {
    public int strStr(String haystack, String needle) {
        /*int pos=-1;
        for(int i=0;i<haystack.length();i++)
        {
            if(i+needle.length()>haystack.length())
                break;
            if(needle.equals(haystack.substring(i,i+needle.length())))
            {
                pos=i;
                break;
            }
        }
        return pos;*/
        return(haystack.indexOf(needle));
    }
}

class StrStr{
    public static void main(String[] args) {
        String haystack="sadhsnasad";
        String needle="hsn";
        Solution ob=new Solution();
        System.out.println(ob.strStr(haystack, needle));

    }
}