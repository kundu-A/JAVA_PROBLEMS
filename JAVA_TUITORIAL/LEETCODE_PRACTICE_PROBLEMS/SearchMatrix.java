class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                 if(target==matrix[i][j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}

public class SearchMatrix {
    public static void main(String[] args) {
        int target=12;
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Solution ob=new Solution();
        System.out.println(ob.searchMatrix(matrix, target));
    }
}
