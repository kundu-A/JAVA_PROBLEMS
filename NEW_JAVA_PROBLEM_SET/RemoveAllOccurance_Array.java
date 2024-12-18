import java.util.*;
class Solution{
    public static void removeOccurance(int nums[],int key){
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key)
                continue;
            else    
                list.add(nums[i]);
        }
        System.out.println(list);
    }
}
public class RemoveAllOccurance_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter values in the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please that value which you want to remove: ");
        int key=sc.nextInt();
        Solution.removeOccurance(ar,key);
        sc.close();
    }
}
