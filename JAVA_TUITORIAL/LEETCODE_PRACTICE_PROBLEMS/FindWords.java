import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop";
	String r2="asdfghjkl";
	String r3="zxcvbnm";
	ArrayList<String> stringList = new ArrayList<>();
	int c=0;
	for(int i=0;i<words.length;i++)
	{
		String s=words[i];
		String s1=s.toLowerCase();
		int flag=0;
		for(int j=0;j<s1.length();j++)
		{
			for(int k=0;k<r1.length();k++)
			{
				if(s1.charAt(j)==r1.charAt(k))
					flag++;
			}
		}
		if(flag==s.length())
			stringList.add(s);
		flag=0;
		for(int j=0;j<s1.length();j++)
		{
			for(int k=0;k<r2.length();k++)
			{
				if(s1.charAt(j)==r2.charAt(k))
					flag++;
			}
		}
		if(flag==s.length())
			stringList.add(s);
		flag=0;
		for(int j=0;j<s1.length();j++)
		{
			for(int k=0;k<r3.length();k++)
			{
				if(s1.charAt(j)==r3.charAt(k))
					flag++;
			}
		}
		if(flag==s.length())
			stringList.add(s);
	}
	String ans[]=new String[stringList.size()];
	for(int i=0;i<stringList.size();i++)
		ans[i]=stringList.get(i);
	return ans;
    }
}
class FindWords
{
	public static void main(String args[])
	{
		String words[]={"Hello","Alaska","Dad","Peace"};
		Solution ob=new Solution();
		String ans[]=ob.findWords(words);
		for(int i=0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
	}
}