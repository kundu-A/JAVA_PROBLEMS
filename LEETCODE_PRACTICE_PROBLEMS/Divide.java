class Solution {
    public int divide(int dividend, int divisor) {
	long dd=dividend;
	long ds=divisor;
	int r1=(int)Math.pow(-2,31);
	int r2=(int)Math.pow(2,31);
	long res=dd/ds;
	if(res>(r2-1)) 
		return r2;
	if(res<r1)
		return r1;
	else
		return (int)res;
}
}
class Divide{
	public static void main(String args[])
	{
		Solution ob=new Solution();
		System.out.println(ob.divide(-2147483648,-1));
	}
}