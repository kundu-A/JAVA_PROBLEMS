import java.util.*;
class Solution{
    public static boolean isPresent(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(key==nums[i])
                return true;
        }
        return false;
    }
}
public class PresenceOfElements_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter values in the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("please enter values in the array: ");
        for(int i=0;i<size;i++)  
            ar[i]=sc.nextInt();
        System.out.println("Please enter that element which you want to find: ");
        int key=sc.nextInt();
        boolean result=Solution.isPresent(ar,key);
        System.out.println("Is "+key+" present? -> "+result);
        sc.close();
    }
}
