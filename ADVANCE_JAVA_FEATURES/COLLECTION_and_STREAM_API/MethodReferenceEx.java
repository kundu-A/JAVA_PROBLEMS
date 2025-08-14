//Method Reference-> use method   withput invoking and in the place of lambda expression.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferenceEx {
    public static void main(String[] args) {
        List<String> students=Arrays.asList("Arpan","Bablu","Akash");
        students.forEach(x->System.out.println(x));
        /*But we can use Method reference in the place of lambda expression */
        students.forEach(System.out::println);

        //Constructor Reference
        List<String> phoneNames=Arrays.asList("A","B","C");
        /*This is using lamdba expression */
        List<Phone> phones=phoneNames.stream().map(x->new Phone(x)).collect(Collectors.toList());
        /*This is using constructor reference */
        List<Phone> phoneList=phoneNames.stream().map(Phone::new).collect(Collectors.toList());
    }
}
class Phone{
    String name;
    public Phone(String name){
        this.name=name;
    }
}