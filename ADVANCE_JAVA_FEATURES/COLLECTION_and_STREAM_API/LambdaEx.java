import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

interface Car{
    void drive();
}
//1st approach -> by implementing the interface in external class
class SUV implements Car{
    public void drive(){
        System.out.println("A person is driving a SUV");
    }
}
public class LambdaEx {
    public static void main(String[] args) {
        SUV suv=new SUV();
        suv.drive();
        /********************************************************************* */

        //2nd approach -> by implementing the interface in annyomious inner class
        Car thar=new Car() {
            public void drive(){
                System.out.println("A person is driving Thar");
            }
        };
        thar.drive();
        /********************************************************************* */

        //3rd approach -> by using Lambda expression
        Car mercedes=()->System.out.println("I am driving a Mercedes");
        mercedes.drive();

        // Learn Predicate , a functional interface. In the predicate interface we have boolean test(T i) method.
        Predicate<Integer> practice1=i->i%2==0;//Here we just check a condition
        System.out.println(practice1.test(4));
        System.out.println(practice1.test(5)); 

        Predicate<String> practice2=s->s.toLowerCase().startsWith("a");
        Predicate<String> practice3=s->s.toLowerCase().endsWith("n");
        Predicate<String> practice4=practice2.and(practice3);
        System.out.println(practice4.test("Arpan"));
        System.out.println(practice4.test("Akash"));

        //Learn Function , a funcational interface. In the function interface we have a R apply(T t) method.
        Function<Integer,Integer> doubleIt=i->i*2;//Here we perform some operation
        System.out.println(doubleIt.apply(20));
        Function<Integer,Integer> tripleIt=i->i*3;
        //20*2=40 then 40*3=120
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        //It will return our given value
        Function<Integer,Integer> identity=Function.identity();
        Integer res1=identity.apply(10);
        System.out.println(res1);

        //Learn Consumer, a functional interface. In the function interface we have a accept(T t) method, which doesn't return any thing ,just consume something.
        Consumer<Integer> print = x->System.out.println("Your value is "+x);
        print.accept(100);
        List<String> names=Arrays.asList("Arpan","Goutam","Sunny","Rup");
        Consumer<List<String>> printNameList=i->{
            for (String name : names) {
                System.out.println(name);
            }
        };
        printNameList.accept(names);

        //Learn Supplier, a functional interface. In the  interface we have T get() method, which doesn't accept anything but returns.
        Supplier<String> printValue=()->"Hello from this side";
        System.out.println(printValue.get());

        //Combined Example
        Predicate<Integer> predicate=i->i%2==0;
        Function<Integer,Integer> function=x->x*2;
        Consumer<Integer> consumer=x->System.out.println(x);
        Supplier<Integer> supplier=()->20;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //BiPredcate,BiConsumer,BiFunction - all are functional interface.
        
        BiPredicate<Integer,Integer> biPredicate=(x,y)->(x+y)%2==0;
        System.out.println(biPredicate.test(10, 20));
        BiConsumer<Integer,Integer> biConsumer=(i,j)->System.out.println(i+j);
        biConsumer.accept(10, 15);
        BiFunction<String,String,Integer> biFunction=(s1,s2)->(s1+s1).length();
        System.out.println(biFunction.apply("Arpan", "Kundu"));

        //UnaryOperator and BinaryOperator
        //UnaryOperator -> a functional interface with extends Function interface and have identity method
        UnaryOperator<Integer> unaryOperator=x->x%2;
        System.out.println(unaryOperator.apply(10));

        //BinaryOperator -> a functional interface which extends BiFuntion
        BinaryOperator<Integer> binaryOperator=(x,y)->x+y;
        System.out.println(binaryOperator.apply(10, 10));

    }
}
