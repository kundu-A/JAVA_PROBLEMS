class Solution {
    public int maxScore(String s) {
        int max=-1;
	int c=0;
	for(int i=0;i<s.length()-1;i++)
	{
		String left=s.substring(0,i+1);
		String right=s.substring(i+1,s.length());
		for(int j=0;j<left.length();j++)
		{
			if(left.charAt(j)=='0')
				c++;	
		}
		for(int k=0;k<right.length();k++)
		{
			if(right.charAt(k)=='1')
				c++;	
		}
		if(c>max)
			max=c;
		c=0;
	
	}
	return max;
    }
}
class MaxScore
{
	public static void main(String args[])
	{
		String s="011101";
		Solution ob=new Solution();
		int a=ob.maxScore(s);
		System.out.println(a);
	}
}