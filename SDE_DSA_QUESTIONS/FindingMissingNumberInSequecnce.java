import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindingMissingNumberInSequecnce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter the range: ");
        int range=sc.nextInt();
        if(range!=-1)
            System.out.println("Missing Number is: "+findMissingNumber(ar, range));
        else   
            System.out.println("No number is missing in this range.");
        sc.close();
    }
    public static int findMissingNumber(int[] ar, int range){
        int missingElement=-1;
        List<Integer> list=Arrays.stream(ar).boxed().collect(Collectors.toList());
        for(int i=1;i<=range;i++){
            if(!list.contains(i)){
                missingElement=i;
                break;
            }
        }
        return missingElement;
    }
}
