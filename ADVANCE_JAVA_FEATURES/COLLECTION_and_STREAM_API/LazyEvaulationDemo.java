import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaulationDemo {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Alice","Bob","Charlie","David");

        Stream<String> streamNames = names.stream().filter(
            name->{
                System.out.println("Filtering: "+name);
                return name.length()>3;
            }
        );
        System.out.println("Before filtering operation");

        List<String> result=streamNames.toList();

        System.out.println("After terminal operation");
        System.out.println(result);
    }
}
