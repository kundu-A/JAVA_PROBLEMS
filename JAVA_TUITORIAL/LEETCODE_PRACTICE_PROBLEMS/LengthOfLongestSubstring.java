class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp="";
	String temp1="",temp2="";
	int val=-1,val1=1;
	for(int i=0;i<s.length();i++)
	{
		if(temp1.indexOf(s.charAt(i))==val){
			val1=1;
			val=-1;
			temp1=temp1+s.charAt(i);
		}
		if(temp2.indexOf(s.charAt(i))==val1){
			val=1;
			val1=-1;
			temp2=temp2+s.charAt(i);
		}
		if(temp1.length()>temp2.length()){
			temp=temp1;
			System.out.println(temp1);}
		else{
			temp=temp2;
			//System.out.println(temp2);}
			
	}
	System.out.println(temp);
	return temp.length();
    }
}
class LengthOfLongestSubstring
{
	public static void main(String args[])
	{
		//String s="abcabcbb";
		//String s="bbbbb";
		String s= "pwwkew";
		Solution ob=new Solution();
		System.out.println(ob.lengthOfLongestSubstring(s));
	}
}