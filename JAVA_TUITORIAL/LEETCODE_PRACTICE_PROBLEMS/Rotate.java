class Solution {
    public void rotate(int[][] matrix) {
        int ans[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[i][j]=matrix[matrix.length-1-j][i];
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}

public class Rotate {
    public static void main(String[] args) {
        int matrix[][]={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution ob=new Solution();
        ob.rotate(matrix);
    }
}
