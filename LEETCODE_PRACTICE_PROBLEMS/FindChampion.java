class Solution {
    public int findChampion(int[][] grid) {
        int m=grid.length;
		int n=grid[0].length;
		int max=-1,pos=0;
		for(int i=0;i<m;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(grid[i][j]==1)
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
        return pos;
        
    }
}
public class FindChampion {
    public static void main(String[] args) {
        int ar[][]={{0,0,1},{1,0,1},{0,0,0}};
        Solution ob=new Solution();
        System.out.println(ob.findChampion(ar));
    }
}
