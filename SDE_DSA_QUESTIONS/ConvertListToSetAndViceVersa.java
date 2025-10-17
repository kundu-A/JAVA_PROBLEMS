import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ConvertListToSetAndViceVersa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Set<Integer> set=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        List<Integer> setResult=convertToList(set);
        System.out.println(setResult);
        Set<Integer> listResult=convertToSet(list);
        System.out.println(listResult);
        sc.close();
    }
    public static List<Integer> convertToList(Set<Integer> set){
        return new ArrayList<>(set);
    }
    public static Set<Integer> convertToSet(List<Integer> list){
        return new HashSet<>(list);
    }
}
