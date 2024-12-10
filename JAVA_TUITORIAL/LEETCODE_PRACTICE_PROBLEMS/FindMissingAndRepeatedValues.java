//2965: Find Missing and Repeated Values
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
	int k=0;
	int n=grid.length;
	int ans[]=new int[2];
	int ar[]=new int[n*n+1];
        for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			ar[k++]=grid[i][j];
	}
	for(int i=0;i<ar.length;i++)
	{
		int t=ar[i];
		int flag=0;
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]==ar[j])
			{
				ans[0]=ar[i];
				flag=1;
				break;
			}
		}
		if(flag==1)
			break;
	}
	for(int i=1;i<=ar.length;i++)
	{
		int flag=0;
		for(int j=0;j<ar.length;j++)
		{
			if(i==ar[j])
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			ans[1]=i;
			break;
		}
	}
	return ans;
    }
}
class FindMissingAndRepeatedValues
{
	public static void main(String args[])
	{
		int grib[][]={{9,1,7},{8,9,2},{3,4,6}};
		//int grib[][]={{1,3},{2,2}};
		Solution ob=new Solution();
		int ar[]=new int[2];
		ar=ob.findMissingAndRepeatedValues(grib);
		for(int i=0;i<ar.length;i++)
			System.out.println(ar[i]);
	}
}