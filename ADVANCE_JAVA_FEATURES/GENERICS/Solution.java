import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//This is the syntax of the Generics , where we specify the type , means which type of variable we are going to add.
        list.add("Hello");
        list.add("World");
        //list.add(124);//This will produce complie time exception , becuase  it is Integer.
        String s1=list.get(0);//Now we don't need to cast manually and also check in compile time so the type safety issue also resolved.
        String s2=list.get(1);
        System.out.println(s1+" "+s2);
    }
}
/*
 * T: Type
 * E: Element (Used in Collections)
 * K: Key (Used in Maps)
 * V: Value (Used in Maps)
 * N: Number
 */
