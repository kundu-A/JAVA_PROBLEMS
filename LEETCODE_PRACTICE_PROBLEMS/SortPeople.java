class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String sort[]=new String[names.length];
	int pos=0;
	for(int i=0;i<heights.length;i++)
	{
		int temp=heights[i];
		pos=i;
		for(int j=0;j<heights.length;j++)
		{
			if(temp<heights[j])
			{
				pos=j;
				temp=heights[j];
			}
		}
		sort[i]=names[pos];
		heights[pos]=-1;
	}
	return sort;
    }
}
class SortPeople
{
	public static void main(String args[])
	{
		int heights[]={155,185,150};
		String names[]={"Alice","Bob","Bob"};
		Solution ob=new Solution();
		String sort[]=ob.sortPeople(names,heights);
		for(int i=0;i<sort.length;i++)
			System.out.print(sort[i]+" ");
	}
}