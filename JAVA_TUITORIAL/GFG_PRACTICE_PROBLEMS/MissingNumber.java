import java.util.Arrays;
class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        int c=array[0];
        for(int i=0;i<n;i++){
            if(c!=array[i]){
                break;
            }
            else
                c++;
        }
        return c;
    }
}
class MissingNumber{
    public static void main(String[] args) {
        int array[]={2};
        int n=2;
        Solution ob=new Solution();
        System.out.println(ob.missingNumber(array, n));
    }
}