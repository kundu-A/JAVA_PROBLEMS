//Intermediate operations transform a stream into another stream.
//They are lazy,meaning  they don't execute untill a terminal operation is invoked.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOps {
    public static void main(String[] args) {
        //1. filter()
        List<String> list=Arrays.asList("Ajhjvddhj","sjhjvdbhjha","jgdvffjae","Ajhjvddhj");
        Stream<String> stream1=list.stream().filter(x->x.toLowerCase().startsWith("a"));
        //Till the time it will not perform any operation , because we didn't invoke it.
        int a=(int) stream1.count();
        //Here it will perform the operations because here we invoke it.
        System.out.println(a);
        System.out.println("**********************************************");

        //2.map()
        Stream<String> stream2=list.stream().map(String::toUpperCase);
        stream2.forEach(System.out::println);
        System.out.println("**********************************************");

        //3.sorted()
        Stream<String> sortedStream=list.stream().sorted();
        sortedStream.forEach(System.out::println);
        System.out.println("**********************************************");
        //Using comparator
        Stream<String> sortedStream2=list.stream().sorted((x,y)->x.length()-y.length());
        sortedStream2.forEach(x->System.out.println(x));
        System.out.println("**********************************************");

        //4.distinct()
        long size=list.stream().filter(x->x.toLowerCase().startsWith("a")).count();
        System.out.println(size);
        System.out.println("**********************************************");//With out distinct - it will return the duplicate value. but if we want to access only unique values then we have to use distinct.

        size=list.stream().filter(x->x.toLowerCase().startsWith("a")).distinct().count();
        System.out.println(size);
        System.out.println("**********************************************");

        //5.limit()
        System.out.println(Stream.iterate(1, i->i+1).limit(10).count());
        System.out.println("**********************************************");

        //6.skip()
        //It starts from 11 not from 1 because we skip 10 means 1 to 10.
        Stream<Integer> stream4=Stream.iterate(1, i->i+1).skip(10).limit(10);
        stream4.forEach(x->System.out.println(x));
        System.out.println("**********************************************");

        //7.peek()
        //Perform an action each element as it is consumed.
        Stream.iterate(1,x->x+1).limit(100).peek(System.out::println).count();
        System.out.println("**********************************************");

        //8.flatMap()
        //Handle streams of collection, lists, or arrays where each element is itself a collection.
        //Flatten nested structures(e.g., lists within lists) so that they can be processed as a single sequence of elements.
        //Transform and flatten elements at the same time.

        //This is basically a 2D list -  a single list contains multiple lists.
        List<List<String>> listOfLists=Arrays.asList(
            Arrays.asList("apple","banana"),
            Arrays.asList("orange","kiwi"),
            Arrays.asList("pear","grape")
        );
        System.out.println(listOfLists.get(0).get(1));
        //Now we want to convert that 2D list into a flat list.
        System.out.println(
            listOfLists.stream().flatMap(x->x.stream()).map(String::toUpperCase).toList()
        );
        System.out.println("**********************************************");

        //Here we convert the stream into list
        List<String> sentances=Arrays.asList(
            "hello world",
            "java streams are very powerful",
            "flatmap is useful"
        );
        System.out.println(
            sentances.stream().flatMap(sentance->Arrays.stream(sentance.split(" "))).map(String::toUpperCase).toList()
        );
        System.out.println("**********************************************");
    }
}
