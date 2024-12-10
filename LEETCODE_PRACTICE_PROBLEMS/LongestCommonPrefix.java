class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs.length;i++){
        if(strs[i].length()==0)
            return strs[i];
        }
        String s="";s=s+strs[0].charAt(0);
        int flag=0;
        for(int i=1;i<strs.length;i++)
        {
            if(s.charAt(0)==strs[i].charAt(0)){
                s=s+strs[i].charAt(0);
            }
            else
            {
                s="";
                flag=1;
                break;
            }
        }
        if(flag==1)
            return s;
        else{
            int min=Integer.MAX_VALUE;
            for(int i=0;i<strs.length;i++)
            {
                if(strs[i].length()<min)
                    min=strs[i].length();
            }
            flag=0;
            s="";
            s=s+strs[0].charAt(0);
            for(int i=1;i<min;i++)
            {
                for(int j=1;j<strs.length;j++){
                    if(strs[0].charAt(i)!=strs[j].charAt(i)){
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                        s=s+strs[0].charAt(i);
            }
            return s;   
        } 
    }
}

        

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};
        //String strs[]={"",""};
        Solution ob=new Solution();
        System.out.println(ob.longestCommonPrefix(strs));
    }
}