import java.util.Arrays;
import java.util.List;

//WlidCard means "?" , when the type is unknown to us then we will use ? instead of using T,P,K,V,etc.
//By using it we only read values , don't write .
public class WildCardGenerics {
    public static void main(String[] args) {
        //ArrayList<?> arrayList=new ArrayList<>();
        //arrayList.add(1); - We can't do this , because this is write operation.
        //arrayList.get(0); - we can do this , because this is read operation.
        System.out.println(sum(Arrays.asList(1,2,3,4,5)));
        printNumbers(Arrays.asList(1,2,3,4,5,6));
    }

    //Here we just read the values of Number list and then perform some operation.
    //This is called "Upper Bound" , means all the child class of the Numbers , we can implement here , but not the Parent class of Numbers.
    public static double sum(List<? extends Number> Numbers){
        double result=0;
        for(Number n:Numbers)
            result=result+n.doubleValue();
        return result;
    }

    //In this way we also add bound - it means all the super class/parent class of Integer will be accessed here.
    //This is called "Lower Bound" , means all the parent class of Integer class will be accessed here , but the child classes.
    public static void printNumbers(List<? super Integer> list){
        for(Object o:list)
            System.out.println(o);
    }
}
