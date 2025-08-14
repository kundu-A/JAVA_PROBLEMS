import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOps {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        //1.collect
        numbers.stream().skip(1).collect(Collectors.toList());
        List<Integer> skippedList=numbers.stream().skip(1).toList(); //Both are the same things
        skippedList.forEach(System.out::println);
        System.out.println("**********************************************");

        //2.forEach
        numbers.stream().forEach(x->System.out.println(x));
        System.out.println("**********************************************");

        //3.reduce:combine elements to produce a single result
        //Basically here 1*2*3*4*5=120 will stored in optionalInteger variable.
        //Optional is class which restrict NullPointerException , if any value is present then provide that, but if not then atleast it will produce null.
        Optional<Integer> optionalInteger=numbers.stream().reduce((i,j)->i*j);
        System.out.println(optionalInteger.get());
        System.out.println("**********************************************");

        //4.count()
        System.out.println(numbers.stream().count());
        System.out.println("**********************************************");

        //5. anyMatch, allMatch, noneMatch
        //anyMatch - it returns true if any of the number is even , otherwise returns false
        System.out.println(numbers.stream().anyMatch(x->x%2==0));//true
        System.out.println("**********************************************");
        //allMatch - it returns true if all the numbers match the condition , otherwise false.
        System.out.println(numbers.stream().allMatch(x->x%2==0));//false
        System.out.println("**********************************************");
        //noneMatch - it returns true if any numbers will not match the given condition , otherwise false.
        System.out.println(numbers.stream().noneMatch(x->x<0));//true
        System.out.println("**********************************************");

        //6.findFirst, findAny
        //findFirst - it will returns the first element from the list
        System.out.println(numbers.stream().findFirst().get());
        System.out.println("**********************************************");
        //findAny - it will returns any element from the list
        System.out.println(numbers.stream().findAny().get());
        System.out.println("**********************************************");

        //7.toArray() - to convert into array
        Object[] array=Stream.of(1,2,3).toArray();
        for(Object o:array)
            System.out.print(o+" ");
        System.out.println("\n**********************************************");

        //8.min/max
        //max - it will return the maximum element from the list
        System.out.println(Stream.of(2,44,54,3).max(Comparator.naturalOrder()).get());
        System.out.println("**********************************************");
        //min - it will return the minimum element from the list
        System.out.println(Stream.of(2,44,54,3).min(Comparator.naturalOrder()).get());
        System.out.println("**********************************************");

        //Example - Stream can used only once , means if we already use terminal operation on stream ,and then if we want to perform some operation on it then, it will throws an exception.
        List<String> names=Arrays.asList("abcd","efgh","ijkl","mnop");
        Stream<String> nameStream=names.stream();
        nameStream.forEach(System.out::println);//This is terminal operation.
        //System.out.println(nameStream.map(String::toUpperCase).toList()); 
        // this will throws an exception - stream has already been operated upon or closed.  
        System.out.println("**********************************************");

        //9.forEachOrdered
        //It used in parallel stream , because in parallel stream it will execute in arbitrary manner, but if we want to execute ordered wise then we have to use it.
        List<Integer> numberList=Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Using forEach with parallel stream: ");
        numberList.parallelStream().forEach(System.out::println);
        System.out.println("**********************************************");

        System.out.println("Using forEachOrdered with parallel stream: ");
        numberList.parallelStream().forEachOrdered(System.out::println);
        System.out.println("**********************************************");

    }
}
