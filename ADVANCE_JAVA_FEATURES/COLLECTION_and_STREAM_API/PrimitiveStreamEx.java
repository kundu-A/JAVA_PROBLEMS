import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreamEx {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Convert array to IntStream
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(System.out::println);
        System.out.println("************************************************");

        // range()
        IntStream.range(1, 5).forEach(System.out::println);
        System.out.println(IntStream.range(1, 5).boxed().collect(Collectors.toList()));
        System.out.println("************************************************");

        // rangeClosed()
        System.out.println(IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()));
        System.out.println("************************************************");

        // of()
        IntStream.of(1, 2, 3, 4).forEach(System.out::println);
        System.out.println("************************************************");

        // Random doubles
        DoubleStream doubleStream = new Random().doubles(10);
        System.out.println(doubleStream.boxed().toList());
        System.out.println("************************************************");

        // Sum of random ints
        IntStream intStream = new Random().ints(5);
        System.out.println(intStream.sum());
        System.out.println("************************************************");

        // average()
        double avg = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Average: " + avg);
        System.out.println("************************************************");

        // max() & min()
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        int min = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        System.out.println("Max: " + max + ", Min: " + min);
        System.out.println("************************************************");

        // filter()
        System.out.println("Even numbers: " +
                Arrays.stream(numbers).filter(n -> n % 2 == 0).boxed().toList());
        System.out.println("************************************************");

        // map()
        System.out.println("Squares: " +
                Arrays.stream(numbers).map(n -> n * n).boxed().toList());
        System.out.println("************************************************");

        // distinct()
        int[] numsWithDuplicates = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Distinct: " +
                Arrays.stream(numsWithDuplicates).distinct().boxed().toList());
        System.out.println("************************************************");

        // sorted()
        System.out.println("Sorted in reverse: " +
                Arrays.stream(numsWithDuplicates).boxed()
                        .sorted((a, b) -> b - a).toList());
        System.out.println("************************************************");

        // asDoubleStream()
        System.out.println("As Double Stream: " +
                Arrays.stream(numbers).asDoubleStream().boxed().toList());
        System.out.println("************************************************");

        // summaryStatistics()
        IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("************************************************");

        // limit() and skip()
        System.out.println("First 3 numbers: " +
                Arrays.stream(numbers).limit(3).boxed().toList());
        System.out.println("After skipping 2: " +
                Arrays.stream(numbers).skip(2).boxed().toList());
        System.out.println("************************************************");
    }
}