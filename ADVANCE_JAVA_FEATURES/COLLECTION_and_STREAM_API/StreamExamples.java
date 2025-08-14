import java.util.Arrays;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {
        //Filtering and Collecting names
        List<String> names=Arrays.asList("Anna","Bob","Charlie","David");
        System.out.println(names.stream().filter(x->x.length()>3).toList());
        System.out.println("**********************************************");

        //Squaring and sorting
        List<Integer> numbers=Arrays.asList(5,4,3,2,1);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());
        System.out.println("**********************************************"); 

        //Summing values
        List<Integer> numList=Arrays.asList(1,2,3,4,5);
        System.out.println(numList.stream().reduce(Integer::sum).get());
        System.out.println("**********************************************");

        //Counting and Occurance of a Character
        //by using chars() we can convert a string to a stream and then we can perform any operation
        String sentence="Hello World";
        System.out.println(sentence.chars().filter(x->x=='l').count());
        System.out.println("**********************************************");

        //Stateful and Stateless
        //stateful - when all the elements are dependent with each others ,like sorted() - it knows all the elements and then it can sort order wise.
        //Stateless -  when each elements are independent with each others , like map(x->x+2) - at a time it consider single value from the list , it doesn't need next or previous value to perform the current operation.

    }
}

//1:12:51
