import java.util.HashMap;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        String[] fruits=new String[size];
        System.out.println("Please enter fruits name in the array: ");
        for(int i=0;i<size;i++)
            fruits[i]=sc.next();
        HashMap<String,Integer> result=frequencyCounting(fruits);
        System.out.println(result);
        sc.close();
    }
    public static HashMap<String,Integer> frequencyCounting(String[] fruits){
        HashMap<String,Integer> count=new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            if(!count.containsKey(fruits[i])){
                int c=0;
                for(int j=i;j<fruits.length;j++){
                    if(fruits[i].equals(fruits[j]))
                        c++;
                }
                count.put(fruits[i], c);
            }
        }
        return count;
    }
}
