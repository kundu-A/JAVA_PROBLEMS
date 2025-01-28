import java.util.*;
public class Array_KeyWiseSearch {
    public static int search(int nums[],int key){
        if(nums.length<=0){
            System.out.println("This is not valid!!");
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter the key element for searching: ");
        int key=sc.nextInt();
        int index=search(ar, key);
        if(index!=-1)
            System.out.println(key+" is present at "+(index+1));
        else
            System.out.println(key+" not found!!");
        sc.close();
    }
}
