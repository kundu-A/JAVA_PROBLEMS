import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindCommonElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int nums1[]=new int[size];
        int nums2[]=new int[size];
        System.out.println("Please enter values in 1st array: ");
        for(int i=0;i<size;i++)
            nums1[i]=sc.nextInt();
        System.out.println("Please enter values in 2nd array: ");
        for(int i=0;i<size;i++)
            nums2[i]=sc.nextInt();
        int[] result=findCommonElement(nums1, nums2);
        System.out.println("Common elements are: ");
        for (int i : result) 
            System.out.print(i+" ");
        sc.close();
    }
    public static int[] findCommonElement(int[] nums1, int[] nums2){
        List<Integer> commonElement=new ArrayList<>();
        List<Integer> list=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        for(int i=0;i<nums1.length;i++){
            if(list.contains(nums1[i]))
                commonElement.add(nums1[i]);
        }
        return commonElement.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
    }
}
