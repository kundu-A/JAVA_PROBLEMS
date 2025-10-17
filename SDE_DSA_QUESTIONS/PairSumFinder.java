import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairSumFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        System.out.println("Please enter values in array: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        System.out.println("Please enter the target value: ");
        int target=sc.nextInt();
        List<int[]> result=findPairs(ar, target);
        System.out.println("Pairs are which meet the target value: ");
        for(int i=0;i<result.size();i++)
            System.out.println("("+result.get(i)[0]+","+result.get(i)[1]+")");
        sc.close();
    }
    public static List<int[]> findPairs(int[] ar,int target){
        List<int[]> result=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if((ar[i]+ar[j])==target){
                    result.add(new int[]{ar[i],ar[j]});
                    break;
                }
            }
        }
        return result;
    }
}
