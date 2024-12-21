import java.util.*;
class Solution{
    public static int linearSearch(int nums[],int key){
        int result=0,flag=0;
        for(int i=0;i<nums.length;i++){
            if(key==nums[i]){
                result=i;
                flag=1;
                break;
            }
        }
        if(flag==1)
            return result;
        else
            return -1;
    }
}
public class LinearSearch_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter the key element to search: ");
        int key=sc.nextInt();
        int result=Solution.linearSearch(ar, key);
        if(result==-1)
            System.out.println(key+" is not present in the array.");
        else
            System.out.println(key+" is present in the array at "+result);
        sc.close();
    }
}