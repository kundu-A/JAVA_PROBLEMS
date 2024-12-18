//Remove duplicate from the array.
import java.util.*;
class Solution{
    public static int[] removeDuplicate(int nums[]){
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if (list.indexOf(nums[i])==-1) 
                list.add(nums[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
public class RemoveDuplicate_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array : ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int result[]=Solution.removeDuplicate(ar);
        System.out.println("After removing element from the array: ");
        for(int i=0;i<result.length;i++)
            System.out.print(ar[i]+" ");
        sc.close();
    }
}
