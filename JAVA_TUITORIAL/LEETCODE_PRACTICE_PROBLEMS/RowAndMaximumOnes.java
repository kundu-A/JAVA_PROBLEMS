//Leetcode 2643: Row with maximum ones.
class Solution
{
	public int[] rowAndMaximumOnes(int mat[][])
	{
		int m=mat.length;
		int n=mat[0].length;
		System.out.println(n);
		int max=-1,pos=0;
		int ar[]=new int[2];
		for(int i=0;i<3;i++)
		{
			int c=0;
			for(int j=0;j<2;j++)
			{
				if(mat[i][j]==1)
					c++;
			}
			if(c==max)
			{}
			else if(c>max)
			{
				max=c;
				pos=i;
			}
		}
		ar[0]=pos;
		ar[1]=max;
		return ar;
	}
}
class RowAndMaximumOnes
{
	public static void main(String args[])
	{
		int mat[][]={{0,0},{1,1},{0,0}};
		Solution ob=new Solution();
		int ar[]=ob.rowAndMaximumOnes(mat);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
	}
}