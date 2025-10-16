import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Duplicates elements are: ");
        int[] result=findDuplicate(ar);
        for (int i : result)
            System.out.print(i+" ");
        sc.close();
    }
    public static int[] findDuplicate(int[] ar){
        Set<Integer> uniqueSet=new  HashSet<>();
        List<Integer> duplicates=new ArrayList<>();
        for(int i:ar){
            if(!uniqueSet.add(i))
                duplicates.add(i);
        }
        return duplicates
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}