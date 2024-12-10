// Leetcode 1380: Lucky Numbers in a Matrix.
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
	for(int i=0;i<matrix.length;i++)
	{
		int min=matrix[i][0],pos=0;
		for(int j=0;j<matrix[i].length;j++)
		{
			if(min>matrix[i][j])
			{
				min=matrix[i][j];
				pos=j;
			}
		}
		int max=-1;
		for(int k=0;k<matrix.length;k++)
		{
			if(max<matrix[k][pos])
				max=matrix[k][pos];
		}
		if(min==max)
		{
			res.add(max);
			break;
		}
	}
	return res;
    }
}
class LuckyNumbers
{
	public static void main(String args[])
	{
		int matrix[][]={{7,8},{1,2}};
		Solution ob=new Solution();
		System.out.println(ob.luckyNumbers(matrix));
	}
}