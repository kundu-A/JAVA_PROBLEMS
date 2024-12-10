/*
 * Find a peak element which is not smaller than its neighbours
Last Updated : 31 May, 2024
Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.

Note: If the array is increasing then just print the last element will be the maximum value.

Example:

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
 */
import java.util.*;
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements in th array: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        System.out.println("The peak element is : "+solution(ar));
        sc.close();
    }
    public static int solution(int ar[]){
        int result=0;
        for(int i=1;i<ar.length-1;i++){
            if(ar[i]>ar[i-1] && ar[i]>ar[i+1]){
                result=ar[i];
                break;
            }
        }
        return result;
    }
}
