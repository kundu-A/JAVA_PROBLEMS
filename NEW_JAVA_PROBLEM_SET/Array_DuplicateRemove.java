import java.util.*;
public class Array_DuplicateRemove {
    public static int[] removeDuplicate(int ar[]){
        List<Integer> list=new ArrayList<>();
        list.add(ar[0]);
        for(int i=1;i<ar.length;i++){
            if(list.get(list.size()-1)!=ar[i])
                list.add(ar[i]);
        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
            result[i]=list.get(i);
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
        int result[]=removeDuplicate(ar);
        for (int i : result) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
