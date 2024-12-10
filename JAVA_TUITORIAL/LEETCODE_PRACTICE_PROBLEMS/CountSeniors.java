//Leetcode 2678: Number of Senior Citizens.
class Solution
{
	public int countSeniors(String details[])
	{
		int c=0;
		for(int i=0;i<details.length;i++)
		{
			char t1=details[i].charAt(11);
			char t2=details[i].charAt(12);
			if((t1=='6' && t2>'0') || (t1>'6' && t2>='0'))
				c++;
		}
		return c;
	}
}
class CountSeniors
{
	public static void main(String args[])
	{
		String details[]={"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
		Solution ob=new Solution();
		System.out.println(ob.countSeniors(details));
	}
}