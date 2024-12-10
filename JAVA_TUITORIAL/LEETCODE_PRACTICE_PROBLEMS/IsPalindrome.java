class Solution {
    public boolean isPalindrome(int x) {
        /*StringBuffer s=new StringBuffer(String.valueOf(x));
		if(s.toString().equals(s.reverse().toString()))
			return true;
		else
			return false;*/
		int store=x;
		boolean flag=true;
		if(x<0){
		 flag=false;
		}
		else{
			int sum=0;
			while(x>0){
				int r=x%10;
				sum=sum*10+r;
				x=x/10;
			}
			if(store==sum)
				flag=true;
			else
				flag=false;
			return flag;
		}
		if(flag==true)
			return true;
		else
			return false;
    }
}
class IsPalindrome
{
	public static void main(String args[])
	{
		int x=121;
		Solution ob=new Solution();
		boolean ans=ob.isPalindrome(x);
		System.out.println(ans);
	}
}