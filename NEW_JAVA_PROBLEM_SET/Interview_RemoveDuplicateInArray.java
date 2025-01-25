import java.util.*;
public class Interview_RemoveDuplicateInArray {
    public static int[] removeDuplicates(int ar[]){
        HashSet<Integer> set=new HashSet<>();
        for (Integer i : ar) 
            set.add(i);
        int result[]=new int[set.size()];
        int k=0;
        for (int i : set) 
            result[k++]=i;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int result[]=removeDuplicates(ar);
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
        sc.close();
    }
}
