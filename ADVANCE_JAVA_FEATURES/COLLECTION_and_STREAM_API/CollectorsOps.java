import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsOps {
    public static void main(String[] args) {
        //1. Collecting to a List
        List<String> names=Arrays.asList("Alice","Bob","Charlie");
        List<String> nameList=names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(nameList);
        System.out.println("**********************************************");


        //2. Collecting to a Set
        List<Integer> numbers=Arrays.asList(1,2,3,3,5,5,7,8,9);
        Set<Integer> numberSet=numbers.stream().collect(Collectors.toSet());
        System.out.println(numberSet);
        System.out.println("**********************************************");


        //3. Collecting to a specific Collection. Means we can convert the stream into anything like LinkedList, ArrayList, ArrayDeque ,etc.
        //Here we can convert stream into linked list.
        LinkedList<String> collecLinkedList=names.stream().collect(Collectors.toCollection(()->new LinkedList<>()));
        System.out.println(collecLinkedList);
        System.out.println("**********************************************");

        //4. Joining Strings - here we can join all the stream elements into one string.
        String concatedString = names.stream().map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(concatedString);
        System.out.println("**********************************************");

        //5. Summarizing Data
        //Generates statistical summary (count,sum,min,average,max)

        List<Integer> numList=Arrays.asList(1,2,3,5,6);
        IntSummaryStatistics stats=numList.stream().collect(Collectors.summarizingInt(x->x));
        System.out.println("Count: "+stats.getCount());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("**********************************************");

        //6. Calculating Averages - we can directly calculate average of the given elements.
        System.out.println("Average of (1,2,3,4,5,6): "+
            numList.stream().collect(Collectors.averagingInt(x->x))
        );
        System.out.println("**********************************************");

        //7. Counting elememts - we can directly count stream elements.
        System.out.println("Count of (1,2,3,4,5,6): "+
            numList.stream().collect(Collectors.counting())
        );
        System.out.println("**********************************************");

        //8. Grouping elements - we can implements grouping in 3 ways.
        //we can group stream elements with our specified logics.
        //Here we want to group elements according to lenght of string.
        List<String> words=Arrays.asList("Hello","World","Java","Streams","Collecting");
        //Here we are just grouping elements according to String length.
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println("**********************************************");

        //Here we are not just grouping elements according to the string length and then also perform joining operation on it and also we can perform other operations.
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length , Collectors.joining(","))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length , Collectors.counting())));
        System.out.println("**********************************************");

        //Here we are grouping elements , create maps with it and then perform some operations.
        //Here we are grouping elements according to the length , then create a new TreeMap with those elements and then count elements.
        TreeMap<Integer,Long> treeMap=words.stream().collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.counting()));
        System.out.println(treeMap);
        System.out.println("**********************************************");

        //9. Partitioning elements
        //Partitions elements into two groups (true and false) based on the  predicate.
        System.out.println(words.stream().collect(
            Collectors.partitioningBy(x->x.length()>5))
        );
        System.out.println("**********************************************");
        //Here at first we are partioning elements and then perform some operation.
        System.out.println(words.stream().collect(
            Collectors.partitioningBy(x->x.length()>5,Collectors.joining(" ")))
        );
        System.out.println("**********************************************");

        //10. Mapping and Collecting
        //Applies a mapping function before collecting.
        System.out.println(
            words.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()))
        );
        System.out.println("**********************************************");
    }
}
