import java.util.ArrayList;

public class ProblemStatement {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();// Here we create object of ArrayList
        arrayList.add("Hello");
        arrayList.add(123);
        arrayList.add(3.14);
    
        String str=(String) arrayList.get(0);//So String is child of Object class , so for that we have to manuannly cast.
        String integer = (String) arrayList.get(1);//Here we want to store the Integer value in String variable, in compile time it is not showing any exception , but the run time it will produce run time exceptions.

        //So we have encountered two problems - 1.Manual Casting , 2.Type Safety Issue.
        //So to solve this problem Generics comes into picture.
    }
}