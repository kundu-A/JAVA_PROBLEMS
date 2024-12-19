import java.util.*;
class Solution{
    public static String[] findCommon(String ar1[],String ar2[]){
        List<String> list=new ArrayList<>();
        for(int i=0;i<ar1.length;i++){
            if(Arrays.asList(ar2).indexOf(ar1[i])!=-1){
                if(list.indexOf(ar1[i])==-1)
                    list.add(ar1[i]);
            } 
        }
        return list.stream().toArray(String[]::new);
    }
}
public class FindCommonElements_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of the 1st array: ");
        int size1=sc.nextInt();
        String ar1[]=new String[size1];
        System.out.println("please enter values in 1st array: ");
        for(int i=0;i<size1;i++)
            ar1[i]=sc.next();
        System.out.println("Please enter the size of the 2nd array: ");
        int size2=sc.nextInt();
        String ar2[]=new String[size2];
        System.out.println("Please enter values in 2nd array: ");
        for(int i=0;i<size2;i++)
            ar2[i]=sc.next();
        String result[]=Solution.findCommon(ar1, ar2);
        System.out.println("Common elements are: ");
        if(result.length==0)
            System.out.println("No common elements are present.");
        else{
            for (String s : result) {
                System.out.print(s+" ");
            }
        }
    sc.close();
    }
}
