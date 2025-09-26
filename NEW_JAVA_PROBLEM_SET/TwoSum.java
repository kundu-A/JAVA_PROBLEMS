/* Problem Statement - Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. Assume each input exactly one solution, and you may not use the same element twice. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Problem name = Two Sum");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target value: ");
        int target=sc.nextInt();
        int[] result1=solution1(ar, target);
        System.out.println("Indices are: ("+result1[0]+","+result1[1]+")");
        System.out.println("**********************************************");
        int[] result2=new int[2];
        try {
            result2 = solution2(ar, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Indices are: ("+result2[0]+","+result2[1]+")");
        sc.close();
    }
    public static int[] solution1(int[] ar,int target){
        int result[]={-1,-1};
        for(int i=0;i<ar.length;i++){
            result[0]=i;
            int flag=0;
            for(int j=i+1;j<ar.length;j++){
                if(target==(ar[i]+ar[j])){
                    result[1]=j;
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                return result;
            result[0]=-1;
        }
        return result;
    }
    public static int[] solution2(int[] ar, int target) throws Exception{
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            int complement=target-ar[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement),i};
            map.put(ar[i], i);
        }
        throw new Exception("No value found");
    }
}
