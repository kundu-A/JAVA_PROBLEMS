import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenSeperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter the values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        List<int[]> result=seperator(ar);
        System.out.println("Odd List: ");
        for(int i=0;i<result.get(0).length;i++)
            System.out.print(result.get(0)[i]+" ");
        System.out.println("\nEven List: ");
        for(int i=0;i<result.get(1).length;i++)
            System.out.print(result.get(1)[i]+" ");
        sc.close();
    }
    public static List<int[]> seperator(int[] nums){
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        return List.of(
            odd.stream().mapToInt(Integer::intValue).toArray(),
            even.stream().mapToInt(Integer::intValue).toArray()
        );
    }
}
