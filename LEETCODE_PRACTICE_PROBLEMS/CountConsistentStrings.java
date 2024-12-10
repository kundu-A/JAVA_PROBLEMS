class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            int flag=0;
            for(int j=0;j<words[i].length();j++)
            {
                if(allowed.indexOf(words[i].charAt(j))==-1)
                {
                    flag=1;
                    break;
                }

            }
            if(flag==0)
                    c++;
            
        }
        return c;
    }
}

public class CountConsistentStrings {
    public static void main(String[] args) {
        String allowed="cad";
        String words[]={"cc","acd","b","ba","bac","bad","ac","d"};
        Solution ob=new Solution();
        System.out.println(ob.countConsistentStrings(allowed, words));

    }
}
