import java.util.*;
public class String_DistanceBetweenWords {
    public static int findDistance(String str[],String w1,String w2){
        int d1=-1,d2=-1,distance=Integer.MAX_VALUE;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(w1))
                d1=i;
            if(str[i].equals(w2))
                d2=i;
            if(d1!=-1 && d2!=-1)
            distance=Math.min(distance,Math.abs(d1-d2));
        }
        return distance;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size=sc.nextInt();
        String str[]=new String[size];
        System.out.println("Please enter values in the array: ");
        for(int i=0;i<str.length;i++)
            str[i]=sc.next();
        System.out.println("Please enter two words to find the distance: ");
        String word1=sc.next();
        String word2=sc.next();
        System.out.println(findDistance(str, word1, word2));
        sc.close();
    }
}
