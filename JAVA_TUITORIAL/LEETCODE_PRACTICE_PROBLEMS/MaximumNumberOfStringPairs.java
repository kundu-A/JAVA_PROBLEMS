//Leetcode 2744: Find maximum number of String pairs.
class Solution
{
	public int maximumNumberOfStringPairs(String words[])
	{
		int c=0;
		for(int i=0;i<words.length;i++)
		{
			StringBuffer sb=new StringBuffer(words[i]);
			sb.reverse();
			for(int j=i+1;j<words.length;j++)
			{
				String s=words[j];
				if(s.equals(sb.toString()))
					c++;
			}
		}
		return c;
	}
} 
class MaximumNumberOfStringPairs
{
	public static void main(String args[])
	{
		String words[]={"aa","ab"};
		Solution ob=new Solution();
		System.out.println(ob.maximumNumberOfStringPairs(words));
	}
}