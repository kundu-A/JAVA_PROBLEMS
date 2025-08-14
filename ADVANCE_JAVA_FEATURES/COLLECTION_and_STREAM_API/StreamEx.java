/*
 * What is Stream?
 * -> A sequence of elements supporting functional and declarative programming.
 * -> Introduced in Java 8.
 * Features of Stream?
 * ->   1.Process collection of data in a a functional and declarative manner.
 *      2.Simply data processing.
 *      3.Embrace Functional Programming.
 *      4.Improve readability and maintainability.
 *      5.Enable easy parallelism.
 * How to use Stream?
 * ->   Source,intermediate operation and terminal operation.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        //Suppose i want to count od number from the list.

        //Using Traditional approach:
        int c=0;
        for(Integer i:numbers){
            if(i%2!=0)
                c++;
        }
        System.out.println("With traditional approach "+c);
        System.out.println("***************************************************");

        //Using Stream:
        System.out.println("With Stream "+numbers.stream().filter(x->x%2!=0).count());
        System.out.println("***************************************************");

        //Creating Streams.
        //1.From Collections
        List<String> names=Arrays.asList("Ram","Krishna");
        Stream<String> namesList1=names.stream();
        namesList1.forEach(System.out::println);
        System.out.println("***************************************************");

        //2.From Arrays
        String[] nameList={"A","B"};
        Stream<String> namesList2=Arrays.stream(nameList);
        namesList2.forEach(System.out::println);
        System.out.println("***************************************************");

        //Using Stream.of()
        Stream<Integer> numberList=Stream.of(1,2,3,4);
        numberList.forEach(System.out::println);
        System.out.println("***************************************************");

        //Infinite Stream
        //It will create a stream of 1's infinite times if we don't set the limit. but here we set the limit 10 , so only 10 1's will created as stream.
        Stream<Integer> stream1=Stream.generate(()->1).limit(10);
        stream1.forEach(x->System.out.println(x));
        System.out.println("***************************************************");

        //Here 1 is seed , means the starting point of stream and it will create infinite stream like - 1,2,3,4,5,6 because it will add 1 with every next value. But here we apply the limit() method to set a size
        Stream<Integer> stream2=Stream .iterate(1, x->x+1).limit(10);
        stream2.forEach(x->System.out.println(x));
        System.out.println("***************************************************");
    }
}
