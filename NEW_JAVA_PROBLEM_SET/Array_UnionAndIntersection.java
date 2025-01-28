import java.util.*;
public class Array_UnionAndIntersection {
    public static void findUnion(int nums1[],int nums2[]){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!list.contains(nums1[i]))
                list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!list.contains(nums2[i]))
                list.add(nums2[i]);
        }
        System.out.println(list);
    }
    public static void findIntersection(int nums1[],int nums2[]){
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
            list1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
            list2.add(nums2[i]);
        for(int i=0;i<list1.size();i++){
            if(list1.contains(list2.get(i)))
                list.add(list2.get(i));
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the 1st array: ");
        int size1=sc.nextInt();
        int ar1[]=new int[size1];
        System.out.println("Please enter values in the 1st array: ");
        for(int i=0;i<size1;i++)
            ar1[i]=sc.nextInt();
        System.out.println("Please enter the size of the 2nd array: ");
        int size2=sc.nextInt();
        int ar2[]=new int[size2];
        System.out.println("Please enter values in the 2nd array: ");
        for(int i=0;i<size2;i++)
            ar2[i]=sc.nextInt();
        System.out.println("This is the result of Union: ");
        findUnion(ar1, ar2);
        System.out.println("This is the result of Intersection: ");
        findIntersection(ar1, ar2);
        sc.close();
    }
}
