import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int[] result=duplicateRemoval(ar);
        System.out.println("After duplicate remove: ");
        for (int i : result)
            System.out.print(i+" ");
        int[] output=removeDuplicate(ar);
        System.out.println("\nAfter duplicate remove: ");
        for (int i : output) {
            System.out.println(i+" ");
        }
        sc.close();
    }
    public static int[] duplicateRemoval(int[] ar){
        if(ar.length==1)
            return ar;
        List<Integer> uniqueList=new ArrayList<>();
        uniqueList.add(ar[0]);
        for(int i=1;i<ar.length;i++){
            if(!uniqueList.contains(ar[i]))
                uniqueList.add(ar[i]);
        }
        return uniqueList.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
    }
    public static int[] removeDuplicate(int[] ar){
        return Arrays.stream(ar)
                        .boxed()
                        .collect(Collectors.toSet())
                        .stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
    }

}
