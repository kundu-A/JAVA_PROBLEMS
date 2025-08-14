//We are going solve some problem as example

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsEx {
    public static void main(String[] args) {
        //Example 1: Collecting names by Length
        List<String> list1=Arrays.asList("Anna","Bob","Alexander","Brian","Alice");
        System.out.println(list1.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println("**********************************************");

        //Example 2: Counting word Occurances
        String sentence="Hello world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));
        System.out.println("**********************************************");

        //Example 3: Partioning even and odd numbers
        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(list2.stream().collect(Collectors.partitioningBy(x->x%2==0)));
        System.out.println("**********************************************");

        //Example 4: Summing values in map
        Map<String,Integer> items=new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summarizingInt(x->x)));
        System.out.println("**********************************************");

        //Example 5: Creating a map from the strea elements. (using toMap())
        List<String> fruits=Arrays.asList("Apple","Banana","Kiwi");
        System.out.println(fruits.stream().collect(Collectors.toMap(String::toUpperCase, String::length)));
        System.out.println("**********************************************");

        //Example 6: Creating a map from the stream elements and also finds count of each elements. e.g., apple=2 like that.
        //Here we at first map keys and values and set the value as 1 and then we increment the count when duplicate is found.
        List<String> fruitBucket=Arrays.asList("Apple","Banana","Kiwi","Apple","Kiwi","Apple","Banana");
        System.out.println(fruitBucket.stream().collect(
            Collectors.toMap(k->k,v->1,(x,y)->x+y))
        );
        System.out.println("**********************************************");
    }
}
