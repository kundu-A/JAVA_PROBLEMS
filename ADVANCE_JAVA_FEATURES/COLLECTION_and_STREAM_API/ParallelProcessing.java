import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelProcessing {
    public static void main(String[] args) {
        //A type of stream that enables parallel processing of elements.
        //Allowing multiple threads to process parts of the stream simultaneously.
        //This can significantly improve performance for the large data sets.
        //Workload is distributed across multiple threads.
        //Here we create list of 20000 numbers using stream.
        /********************** Using Stream ******************************/
        long startTime=System.currentTimeMillis();

        List<Integer> list=Stream.iterate(1, i->i+1).limit(20_000).toList();
        List<Long> resultList=list.stream().map(/*x->factorial(x)*/ParallelProcessing::factorial).toList();

        long endTime=System.currentTimeMillis();
        System.out.println("Time taken with stream: "+(endTime-startTime)+" ms");

        //resultList.forEach(System.out::println);

        /*************************** Using Parallel Stream *************************/

        startTime=System.currentTimeMillis();

        list=Stream.iterate(1, i->i+1).limit(20_000).toList();
        resultList=list.parallelStream().map(/*x->factorial(x)*/ParallelProcessing::factorial).toList();
        //resultList=list.parallelStream().map(/*x->factorial(x)*/ParallelProcessing::factorial).sequential().toList(); - we use this method to convert a list into sequential manner.

        endTime=System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: "+(endTime-startTime)+" ms");

        //resultList.forEach(System.out::println);

        //Parallel streams are most effective for CPU-intensive or large dataste where tasks are independent.
        //They may add overhead for simple tasks or small datasets.

        //Cumulative Sum
        //Input : [1,2,3,4,5] -> Output : [1,3(1+2),6(1+2+3),10(1+2+3+4),15(1+2+3+4+5)]
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        AtomicInteger sum=new AtomicInteger(0);
        List<Integer> cumulativeSum=numbers.parallelStream().map(/*x->sum.addAndGet(x)*/sum::addAndGet).toList();
        System.out.println("Expected result : [1,3,6,10,15]");
        System.out.println("Actual result : "+cumulativeSum);
        //We can see the different result as compared to the actual , because the result is dependent on each others , so task is not independent, thats why we can see this type of error. SO we have to use the Parallel Stream at the time of large dataset and usefull for independent tasks.
    }
    private static long factorial(int n){
        long result=1;
        for(int i=1;i<=n;i++)
            result=result*i;
        return result;
    }
}
